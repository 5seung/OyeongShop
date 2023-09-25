package com.sesac.oyeongshop.dto;

import java.util.Date;

public class  ProductDetailDTO{
	private int productDetailId;	//PK
	private String color;
	private String sizeOption;	
	private String stock;	
	private int productId;	//FK
	
	public ProductDetailDTO() {
		super();
	}
	public ProductDetailDTO(int productDetailId, String color, String sizeOption, String stock, int productId) {
		super();
		this.productDetailId = productDetailId;
		this.color = color;
		this.sizeOption = sizeOption;
		this.stock = stock;
		this.productId = productId;
	}
	public int getProductDetailId() {
		return productDetailId;
	}
	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSizeOption() {
		return sizeOption;
	}
	public void setSizeOption(String sizeOption) {
		this.sizeOption = sizeOption;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "ProductImgDTO [productDetailId=" + productDetailId + ", color=" + color + ", sizeOption=" + sizeOption
				+ ", stock=" + stock + ", productId=" + productId + "]";
	}
}
