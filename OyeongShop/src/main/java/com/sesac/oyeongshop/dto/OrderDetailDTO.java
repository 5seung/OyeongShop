package com.sesac.oyeongshop.dto;

import java.util.Date;

public class OrderDetailDTO {
	private int orderDetailId;	//PK
	private int orderQuantity;
	private int orderId;
	private int productId;
	private String orderColor;
	private String orderSize;
	private int price;

	public OrderDetailDTO() {
		super();
	}
	
	
	public OrderDetailDTO(int orderQuantity, String orderColor, String orderSize, int price) {
		super();
		this.orderQuantity = orderQuantity;
		this.orderColor = orderColor;
		this.orderSize = orderSize;
		this.price = price;
	}



	public OrderDetailDTO(int orderDetailId, int orderQuantity, int orderId, int productId, String orderColor,
			String orderSize, int price) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderQuantity = orderQuantity;
		this.orderId = orderId;
		this.productId = productId;
		this.orderColor = orderColor;
		this.orderSize = orderSize;
		this.price = price;
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getOrderColor() {
		return orderColor;
	}

	public void setOrderColor(String orderColor) {
		this.orderColor = orderColor;
	}

	public String getOrderSize() {
		return orderSize;
	}

	public void setOrderSize(String orderSize) {
		this.orderSize = orderSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderDetailDTO [orderDetailId=" + orderDetailId + ", orderQuantity=" + orderQuantity + ", orderId="
				+ orderId + ", productId=" + productId + ", orderColor=" + orderColor + ", orderSize=" + orderSize
				+ ", price=" + price + "]";
	}
	
}
