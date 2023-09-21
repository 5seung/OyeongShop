package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;

public interface ProductService {
// 	전체상품 조회
	public List<ProductDTO> selectAll();
//	신제품 조회
	public List<ProductDTO> selectNew();
//	특정 상품조회
	public ProductDTO select(int productNo);


}
