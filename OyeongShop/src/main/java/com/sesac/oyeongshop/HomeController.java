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



	
}
