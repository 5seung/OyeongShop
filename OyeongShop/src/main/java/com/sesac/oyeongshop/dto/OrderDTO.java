package com.sesac.oyeongshop.dto;

import java.util.Date;

public class OrderDTO {
	private int orderId;	//PK
	private String userId;	//FK
	private int addressId;	//FK
	private String receiveName;
	private String receivePhone;
	private String orderState;
	private Date orderDate;
	
	public OrderDTO() {
		super();
	}
	
	public OrderDTO(int orderId, String userId, int addressId, String receiveName, String receivePhone,
			String orderState, Date orderDate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.addressId = addressId;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.orderState = orderState;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getReceivePhone() {
		return receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", userId=" + userId + ", addressId=" + addressId + ", receiveName="
				+ receiveName + ", receivePhone=" + receivePhone + ", orderState=" + orderState + ", orderDate="
				+ orderDate + "]";
	}
}
