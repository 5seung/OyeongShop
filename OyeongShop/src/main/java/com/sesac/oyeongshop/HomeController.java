package com.sesac.oyeongshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
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
	
}
