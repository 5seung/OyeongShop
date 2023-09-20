package com.sesac.oyeongshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	TestService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
//		int testResult = service.testInsert();
//		System.out.println(testResult);
		return "home";
	}
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product() {
		return "product";
	}
	@RequestMapping(value = "/product-detail", method = RequestMethod.GET)
	public String productDetail() {
		return "productDetail";
	}
	@RequestMapping(value = "/product-regist", method = RequestMethod.GET)
	public String productRegist() {
		return "productRegist";
	}
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order() {
		return "order";
	}
	@RequestMapping(value = "/order-success", method = RequestMethod.GET)
	public String orderSuccess() {
		return "orderSuccess";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/my-page", method = RequestMethod.GET)
	public String myPage() {
		return "myPage";
	}
	@RequestMapping(value = "/order-list", method = RequestMethod.GET)
	public String orderList() {
		return "orderList";
	}
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile() {
		return "profile";
	}
	@RequestMapping(value = "/review-list", method = RequestMethod.GET)
	public String reviewList() {
		return "reviewList";
	}
	
}
