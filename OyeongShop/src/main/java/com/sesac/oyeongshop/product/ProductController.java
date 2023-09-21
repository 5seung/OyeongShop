package com.sesac.oyeongshop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesac.oyeongshop.dto.ProductDTO;

@Controller
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(Model model) {
		List<ProductDTO> products = service.selectAll();
		System.out.println(products);
		model.addAttribute("products", products);
		return "product";
	}

	@RequestMapping(value = "/product-detail", method = RequestMethod.GET)
	public String productDetail(int productNo, Model model) {
		ProductDTO product = service.select(productNo);
		model.addAttribute("product", product);
		return "productDetail";
	}

	@RequestMapping(value = "/product-regist", method = RequestMethod.GET)
	public String productRegist() {
		return "productRegist";
	}
}
