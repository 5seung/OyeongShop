package com.sesac.oyeongshop.dto;

import java.util.Date;

public class UserDTO {
	private String userId;	//PK
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private Date joinDate;
	private String useState; //활성상태(탈퇴회원 구분용 y,n)
	private String authority; //권한(관리자인지)
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String userId, String pwd, String name, String phone, String email, Date joinDate, String useState,
			String authority) {
		super();
		this.userId = userId;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.joinDate = joinDate;
		this.useState = useState;
		this.authority = authority;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getUseState() {
		return useState;
	}
	public void setUseState(String useState) {
		this.useState = useState;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", joinDate=" + joinDate + ", useState=" + useState + ", authority=" + authority + "]";
	}
}
