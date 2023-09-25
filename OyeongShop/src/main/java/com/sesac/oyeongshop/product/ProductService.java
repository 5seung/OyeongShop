package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;

public interface ProductService {
// 	전체상품 조회
	public List<ProductDTO> selectAll(String category);
//	신제품 조회
	public List<ProductDTO> selectNew();
//	특정 상품조회
	public ProductDTO select(int productNo);
//	상품등록
	public int insert(ProductDTO productInfo);
	public int insert(int key, String storedFileName);
//	상품삭제
	public int delete(int productNo);
	


}
