package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;

public interface ProductDao {
	//전체상품조회
	List<ProductDTO> selectAll();
	//카테고리 상품 조회
	List<ProductDTO> selectAll(String category);

	List<ProductDTO> selectNew();

	ProductDTO selectOne(int productNo);

	int insert(ProductDTO productInfo);
	int insert(int key, String storedFileName);
	
	int delete(int productId);

}
