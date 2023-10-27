package com.sesac.oyeongshop.dto;

public class ProductImgDTO {
	private int productImgId; // PK
	private String storedFileName;
	private int productId; // FK

	public ProductImgDTO() {
		super();
	}

	public ProductImgDTO(int productImgId, String storedFileName, int productId) {
		super();
		this.productImgId = productImgId;
		this.storedFileName = storedFileName;
		this.productId = productId;
	}

	public int getProductImgId() {
		return productImgId;
	}

	public void setProductImgId(int productImgId) {
		this.productImgId = productImgId;
	}

	public String getStoredFileName() {
		return storedFileName;
	}

	public void setStoredFileName(String storedFileName) {
		this.storedFileName = storedFileName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductImgDTO [productImgId=" + productImgId + ", storedFileName=" + storedFileName + ", productId="
				+ productId + "]";
	}

}
