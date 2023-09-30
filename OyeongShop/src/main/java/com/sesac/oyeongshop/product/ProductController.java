package com.sesac.oyeongshop.product;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.review.ReviewService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	@Autowired
	private ReviewService reviwService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product(String category, Model model) {
		List<ProductDTO> products = service.selectAll(category);
		System.out.println(products);
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "product";
	}

	@RequestMapping(value = "/product-detail", method = RequestMethod.GET)
	public String productDetail(int productNo, Model model) {
		ProductDTO product = service.select(productNo);
		model.addAttribute("product", product);
		List<ReviewDTO> reviews = reviwService.selectAll(productNo);
		model.addAttribute("reviews", reviews);

		System.out.println(product.getMainImg());
		return "productDetail";
	}

	@RequestMapping(value = "/product-regist", method = RequestMethod.GET)
	public String productRegist(HttpSession session) {
		session.getAttribute("user");
		return "productRegist";
	}

	@RequestMapping(value = "/product-regist.do", method = RequestMethod.POST)
	public String productRegist(ProductDTO productInfo, ProductDetailDTO productDetail,
			@RequestParam("mainImgFile") MultipartFile file, @RequestParam("subImgFile") List<MultipartFile> subImgList,
			HttpServletRequest request) throws IOException, ServletException {
		System.out.println(productDetail);
		/*
		 * 파일 업로드시 파일명이 동일한 파일이 이미 존재할 수도 있고, 사용자가 업로드 하는 파일명이 언어 이외의 언어로 되어있을 수 있다. 또한
		 * 타언어를 지원하지 않는 환경에서도 정상 동작이 되도록 고유한 랜덤 문자를 부여해 db와 서버에 새로운 파일명으로 저장한다.
		 */

		// 1. 파일명 얻기(+a 사이즈 확인)
		String fileRealName = file.getOriginalFilename();

		// 2. 확장자 얻기: 파일명에서 fileExtension으로 .png같은 확장자를 구함
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());

		// 3. 새로운 파일명으로 부여할 랜덤 문자 생성
		String[] uuids = UUID.randomUUID().toString().split("-");
		String uniqueName = uuids[0] + fileExtension;

		// 4. 업로드할 실제 경로 찾기
		String uploadFolder = request.getServletContext().getRealPath("/upload");
		// 5. 저장할 파일로 만드는 작업
		File saveFile = new File(uploadFolder + File.separator + uniqueName);

		try {
			productInfo.setMainImg(uniqueName);
			int key = service.insert(productInfo);
			service.insert(key, productDetail);
			// 7. 실제 파일 저장메서드(filewriter 작업을 손쉽게 한방에 처리해준다.)
			file.transferTo(saveFile);
			for (MultipartFile subImg : subImgList) {
				fileRealName = subImg.getOriginalFilename();
				fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());
				uuids = UUID.randomUUID().toString().split("-");
				uniqueName = uuids[0] + fileExtension;
				uploadFolder = request.getServletContext().getRealPath("/upload");
				saveFile = new File(uploadFolder + File.separator + uniqueName);
				service.insert(key, uniqueName);
				subImg.transferTo(saveFile);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "productRegist";
	}

	@RequestMapping(value = "/product-delete.do", method = RequestMethod.GET)
	public String productDelete(int productNo) {
		service.delete(productNo);
		return "redirect:/";
	}

}
