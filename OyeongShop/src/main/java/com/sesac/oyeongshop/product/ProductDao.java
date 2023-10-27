package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ProductImgDTO;

public interface ProductDao {
	//전체상품조회
	List<ProductDTO> selectAll();
	//카테고리 상품 조회
	List<ProductDTO> selectAll(String category);
	//신상조회
	List<ProductDTO> selectNew();
	//상품 정보조회
	ProductDTO selectOne(int productNo);
	List<ProductImgDTO> selectImgs(int productNo);
	List<ProductDetailDTO> selectDetail(int productNo);
	//상품 정보 저장
	int insert(ProductDTO productInfo);
	int insert(int key, String storedFileName);
	int insert(int key, ProductDetailDTO productDetail);
	
	int delete(int productId);

}
