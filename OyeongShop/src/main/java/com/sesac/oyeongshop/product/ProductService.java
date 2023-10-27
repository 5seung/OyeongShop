package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ProductImgDTO;

public interface ProductService {
// 	전체상품 조회
	List<ProductDTO> selectAll(String category);

//	신제품 조회
	List<ProductDTO> selectNew();

//	특정 상품조회
	ProductDTO select(int productNo);

//	상품등록
	int insert(ProductDTO productInfo);

	int insert(int key, String storedFileName);

	int insert(int key, ProductDetailDTO productDetail);

//	상품삭제
	int delete(int productNo);

}
