package com.sesac.oyeongshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.product.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<ProductDTO> products = service.selectNew();
		model.addAttribute("products", products);
		return "home";
	}



	
}
