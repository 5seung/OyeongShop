package com.sesac.oyeongshop.dto;

import java.util.Date;

public class AddressDTO {
	private int addressId;	//PK
	private String addressName;	
	private int zoneCode;	
	private String addressDefault;
	private String addressDetail;
	private String userId;	//FK
	
	public AddressDTO() {
		super();
	}
	
	public AddressDTO(int addressId, String addressName, int zoneCode, String addressDefault, String addressDetail,
			String userId) {
		super();
		this.addressId = addressId;
		this.addressName = addressName;
		this.zoneCode = zoneCode;
		this.addressDefault = addressDefault;
		this.addressDetail = addressDetail;
		this.userId = userId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public int getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(int zoneCode) {
		this.zoneCode = zoneCode;
	}
	public String getAddressDefault() {
		return addressDefault;
	}
	public void setAddressDefault(String addressDefault) {
		this.addressDefault = addressDefault;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "AddressDTO [addressId=" + addressId + ", addressName=" + addressName + ", zoneCode=" + zoneCode
				+ ", addressDefault=" + addressDefault + ", addressDetail=" + addressDetail + ", userId=" + userId
				+ "]";
	}
}
