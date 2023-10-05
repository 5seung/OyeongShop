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
public class ReviewController {

	@Autowired
	private ReviewService service;

	@RequestMapping(value = "/reviewList", method = RequestMethod.GET)
	public String reviewList(Model model) {

		List<ReviewDTO> reviews = service.selectAll();

		model.addAttribute("reviews", reviews);

		return "reviewList";
	}

	@RequestMapping(value = "/my-review", method = RequestMethod.GET)
	public String reviewList(Model model, HttpSession session) {
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String userId = dto.getUserId();
		List<ReviewDTO> reviews = service.selectAll(userId);

		model.addAttribute("reviews", reviews);

		return "reviewList";
	}
}
