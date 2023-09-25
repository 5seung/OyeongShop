package com.sesac.oyeongshop.review;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.dto.UserDTO;

@Controller
public class ReviewWriteController {
	
	@Autowired
	private ReviewWriteService service;
	
	//뷰를 보여주기 위한 메소드>구분을 url로 하는것
	@RequestMapping(value = "/reviewWrite", method = RequestMethod.GET)
	public String reviewWrite() {
		return "reviewWrite";
	}
	
	//실행메서드
	@RequestMapping(value = "/reviewWrite.do", method = RequestMethod.GET)
	public String reviewWrite(String reviewContent, String reviewPwd, String userId, int productId) {
		service.insert(reviewContent, reviewPwd, userId, productId);
		return "redirect:/reviewList";
	}
	
	
	//뷰를 보여주기 위한 메소드>구분을 url로 하는것
	@RequestMapping(value = "/pwdCheck", method = RequestMethod.GET)
	public String pwdCheck(int reviewId, Model model) {
		System.out.println("리뷰아이디"+reviewId);
		model.addAttribute("reviewId", reviewId);
		return "pwdCheck";
	}
	
	//실행메서드
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.GET)
	public String pwdCheck(String reviewPwd, int reviewId, HttpSession session, Model model) {
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String userId = dto.getUserId();

		int result = service.reviewPwdCheck(reviewPwd, reviewId, userId);
		System.out.println("result::"+result);
		if(result==0) {
			return "redirect:/pwdCheck?reviewId="+reviewId;
		}
		ReviewDTO review = service.getReviewContent(reviewId);
		model.addAttribute("review", review);
		model.addAttribute("reviewId", reviewId);
		return "redirect:/reviewUpdate";
	/* return "redirect:/reviewUpdate?reviewId="+reviewId; */
	}

	//뷰를 보여주기 위한 메소드>구분을 url로 하는것
	@RequestMapping(value = "/reviewUpdate", method = RequestMethod.GET)
	public String getReviewContent(Model model, int reviewId) {
		System.out.println("리뷰아이디:::::모냐"+reviewId);
		ReviewDTO review = service.getReviewContent(reviewId);
		model.addAttribute("review", review);
		model.addAttribute("reviewId", reviewId);
		return "reviewUpdate";
	}
		
	//뷰를 보여주기 위한 메소드>구분을 url로 하는것
	@RequestMapping(value = "/reviewUpdate.do", method = RequestMethod.GET)
	public String reviewUpdate(String content, int reviewId) {
		System.out.println("fffff");
		int review = service.reviewUpdate(content, reviewId);
		System.out.println("컨트롤러::"+review);
	/* return "redirect:/reviewList"; */
	    return "redirect:/reviewList?reviewId="+reviewId;
	}
	

	//뷰를 보여주기 위한 메소드>구분을 url로 하는것
	@RequestMapping(value = "/pwdCheckDel", method = RequestMethod.GET)
	public String pwdCheckDel(int reviewId, Model model) {
		System.out.println("리뷰아이디"+reviewId);
		model.addAttribute("reviewId", reviewId);
		return "pwdCheckDel";
	}
		
			
	//실행메서드
	@RequestMapping(value = "/reviewDel.do", method = RequestMethod.GET)
	public String reviewDel(String reviewPwd, int reviewId, HttpSession session, Model model) {
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String userId = dto.getUserId();	
		
		System.out.println("reviewDel의 리뷰패스워드 잘나오나::"+reviewPwd);
		int result = service.reviewPwdCheck(reviewPwd, reviewId, userId);

		System.out.println("result::"+result);
		if(result==0) {
			return "redirect:/pwdCheckDel?reviewId="+reviewId;
		}
		int resultDel = service.reviewDel(reviewId);
		System.out.println("resultDel성공하면1::"+resultDel);
		model.addAttribute("reviewId", reviewId);
		return "redirect:/reviewList?reviewId="+reviewId;
	}
		
}
