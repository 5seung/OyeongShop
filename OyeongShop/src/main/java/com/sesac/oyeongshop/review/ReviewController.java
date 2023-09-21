package com.sesac.oyeongshop.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sesac.oyeongshop.dto.ReviewDTO;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
		//주소이동
		@RequestMapping(value = "/reviewList", method = RequestMethod.GET)
		public String reviewList() {
			List<ReviewDTO> dto = service.selectAll();
			for(int i=0; i<dto.size(); i++) {
				System.out.println(dto.get(i));
			}
			return "reviewList";
		}
}
