package com.sesac.oyeongshop.product;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sesac.oyeongshop.FileUploadService;
import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ProductDetailListDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.dto.UserDTO;
import com.sesac.oyeongshop.review.ReviewService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	@Autowired
	ReviewService reviewService;
	@Autowired
	FileUploadService fileUploadService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(String category, Model model) {
		List<ProductDTO> products = service.selectAll(category);
		System.out.println(products);
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "product";
	}

	@RequestMapping(value = "/product-detail", method = RequestMethod.GET)
	public String productDetail(int productNo, HttpSession session, Model model) {
		ProductDTO product = service.select(productNo);
		model.addAttribute("product", product);
		List<ReviewDTO> reviews = reviewService.selectAll(productNo);
		model.addAttribute("reviews", reviews);

		UserDTO dto = (UserDTO) session.getAttribute("user");
		boolean writeCheck = false;
		if (dto != null) {
			String userId = dto.getUserId();
			writeCheck = reviewService.writeCheck(userId, productNo);
		}
		model.addAttribute("writeCheck", writeCheck);

		return "productDetail";
	}

	@RequestMapping(value = "/product-regist", method = RequestMethod.GET)
	public String productRegist(HttpSession session) {
		session.getAttribute("user");
		return "productRegist";
	}

	@RequestMapping(value = "/product-regist.do", method = RequestMethod.POST)
	public String productRegist(ProductDTO productInfo, ProductDetailListDTO productDetailList,
			@RequestParam("mainImgFile") MultipartFile mainImg,
			@RequestParam("subImgFile") List<MultipartFile> subImgList, HttpServletRequest request)
			throws IOException, ServletException {

		String uniqueName = fileUploadService.fileUpload(request, mainImg);

		productInfo.setMainImg(uniqueName);
		int key = service.insert(productInfo);
		for(ProductDetailDTO productDetail : productDetailList.getProductDetail()) {
			service.insert(key, productDetail);
		}

		for (MultipartFile subImg : subImgList) {
			uniqueName = fileUploadService.fileUpload(request, subImg);
			service.insert(key, uniqueName);
		}
		return "redirect:/product-regist";
	}

	@RequestMapping(value = "/product-delete.do", method = RequestMethod.GET)
	public String productDelete(int productNo) {
		service.delete(productNo);
		return "redirect:/";
	}

}
