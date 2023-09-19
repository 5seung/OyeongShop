package com.sesac.oyeongshop.dto;

import java.util.Date;

public class ReviewDTO {
	private int reviewId;	//PK
	private String content;
	private int orderId;
	private int parentId;
	private Date uploadDate;
	private String reviewPwd;
	private String userId;	//FK
	private int productId;	//FK
	
	public ReviewDTO() {
		super();
	}
	
	public ReviewDTO(int reviewId, String content, int orderId, int parentId, Date uploadDate, String reviewPwd,
			String userId, int productId) {
		super();
		this.reviewId = reviewId;
		this.content = content;
		this.orderId = orderId;
		this.parentId = parentId;
		this.uploadDate = uploadDate;
		this.reviewPwd = reviewPwd;
		this.userId = userId;
		this.productId = productId;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getReviewPwd() {
		return reviewPwd;
	}
	public void setReviewPwd(String reviewPwd) {
		this.reviewPwd = reviewPwd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "ReviewDTO [reviewId=" + reviewId + ", content=" + content + ", orderId=" + orderId + ", parentId="
				+ parentId + ", uploadDate=" + uploadDate + ", reviewPwd=" + reviewPwd + ", userId=" + userId
				+ ", productId=" + productId + "]";
	}
}
