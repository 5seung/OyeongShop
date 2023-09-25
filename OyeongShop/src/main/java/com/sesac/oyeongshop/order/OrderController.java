package com.sesac.oyeongshop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService service;

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order() {
		return "order";
	}
	
	//productDetail에서 buyNow버튼 눌렀을때 -> 값만 넘겨주면 됨!(색상,사이즈,수량)
	@RequestMapping(value = "/buy.do", method = RequestMethod.GET)
	public String buy(int price, String color, String size, int quantity, Model model) {
		model.addAttribute(price);
		model.addAttribute(color);
		model.addAttribute(size);
		model.addAttribute(quantity);
		return "redirect:/order";
	}
	
	/*
	 * @RequestMapping(value = "/buy.do", method = RequestMethod.GET) public String
	 * buy(String color, String size, String receivePhone) { service.insert(userId,
	 * receiveName, receivePhone); return "redirect:/order"; }
	 */

	@RequestMapping(value = "/order-success", method = RequestMethod.GET)
	public String orderSuccess() {
		return "orderSuccess";
	}

	@RequestMapping(value = "/order-list", method = RequestMethod.GET)
	public String orderList() {
		return "orderList";
	}

}
