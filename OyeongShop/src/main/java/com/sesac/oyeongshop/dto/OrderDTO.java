package com.sesac.oyeongshop.dto;

import java.util.Date;

public class OrderDTO {
	private int orderId;	//PK
	private String userId;	//FK
	private String receiveName;
	private String receivePhone;
	private String orderState;
	private Date orderDate;
	private int zonecode;
	private String address;
	private String addressDetail;
	private String addressExtra;
	private OrderDetailDTO orderdetail;
	
	
	public OrderDTO() {
		super();
	}

	public OrderDTO(int orderId, String userId, String receiveName, String receivePhone, String orderState,
			Date orderDate, int zonecode, String address, String addressExtra, String addressDetail) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.orderState = orderState;
		this.orderDate = orderDate;
		this.zonecode = zonecode;
		this.address = address;
		this.addressDetail = addressDetail;
		this.addressExtra = addressExtra;
		
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

	public int getZonecode() {
		return zonecode;
	}

	public void setZonecode(int zonecode) {
		this.zonecode = zonecode;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressExtra() {
		return addressExtra;
	}

	public void setAddressExtra(String addressExtra) {
		this.addressExtra = addressExtra;
	}
	
	

	public OrderDetailDTO getOrderdetail() {
		return orderdetail;
	}

	public void setOrderdetail(OrderDetailDTO orderdetail) {
		this.orderdetail = orderdetail;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", userId=" + userId + ", receiveName=" + receiveName
				+ ", receivePhone=" + receivePhone + ", orderState=" + orderState + ", orderDate=" + orderDate
				+ ", zonecode=" + zonecode + ", address=" + address + ", addressDetail=" + addressDetail
				+ ", addressExtra=" + addressExtra + "]";
	}
}
