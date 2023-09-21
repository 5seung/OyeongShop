package com.sesac.oyeongshop.dto;

import java.util.Date;

public class ProductDTO {
	private int productId;	//PK
	private String name;
	private int productionCost;
	private int price;
	private Date uploadDate;
	private String category;
	private String salesStatus;
	private String productContent;
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(int productId, String name, int productionCost, int price, Date uploadDate, String category,
			String salesStatus, String productContent) {
		super();
		this.productId = productId;
		this.name = name;
		this.productionCost = productionCost;
		this.price = price;
		this.uploadDate = uploadDate;
		this.category = category;
		this.salesStatus = salesStatus;
		this.productContent = productContent;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSalesStatus() {
		return salesStatus;
	}

	public void setSalesStatus(String salesStatus) {
		this.salesStatus = salesStatus;
	}

	public String getProductContent() {
		return productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", name=" + name + ", productionCost=" + productionCost
				+ ", price=" + price + ", uploadDate=" + uploadDate + ", category=" + category + ", salesStatus="
				+ salesStatus + ", productContent=" + productContent + "]";
	}
	
}
