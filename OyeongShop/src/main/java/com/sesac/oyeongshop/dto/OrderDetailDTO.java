package com.sesac.oyeongshop.dto;

import java.util.Date;

public class OrderDetailDTO {
	private int orderDetailId;	//PK
	private int orderQuantity;
	private int orderId;
	private int productId;

	public OrderDetailDTO() {
		super();
	}
	
	public OrderDetailDTO(int orderDetailId, int orderQuantity, int orderId, int productId) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderQuantity = orderQuantity;
		this.orderId = orderId;
		this.productId = productId;
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
	
	@Override
	public String toString() {
		return "OrderDetailDTO [orderDetailId=" + orderDetailId + ", orderQuantity=" + orderQuantity + ", orderId="
				+ orderId + ", productId=" + productId + "]";
	}
}
