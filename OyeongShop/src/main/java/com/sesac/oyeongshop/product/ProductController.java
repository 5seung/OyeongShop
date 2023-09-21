package com.sesac.oyeongshop.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
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
}
