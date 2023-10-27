package com.sesac.oyeongshop.dto;

import java.util.List;

public class ProductDetailListDTO {
	private List<ProductDetailDTO> productDetail;

	public List<ProductDetailDTO> getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(List<ProductDetailDTO> productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public String toString() {
		return "ProductDetailListDTO [productDetail=" + productDetail + "]";
	}
	
}
