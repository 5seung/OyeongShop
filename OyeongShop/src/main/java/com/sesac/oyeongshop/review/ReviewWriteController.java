package com.sesac.oyeongshop.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sesac.oyeongshop.dto.ReviewDTO;

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
	public String reviewWrite(String userId, String reviewContent) {
		System.out.println(reviewContent);
		service.insert(reviewContent);
		
		return "redirect:/reviewList";
	}
	
}
