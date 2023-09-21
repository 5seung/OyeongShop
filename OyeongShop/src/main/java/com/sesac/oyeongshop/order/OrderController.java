package com.sesac.oyeongshop.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order() {
		return "order";
	}

	@RequestMapping(value = "/order-success", method = RequestMethod.GET)
	public String orderSuccess() {
		return "orderSuccess";
	}

	@RequestMapping(value = "/order-list", method = RequestMethod.GET)
	public String orderList() {
		return "orderList";
	}
}
