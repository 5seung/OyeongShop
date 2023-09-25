package com.sesac.oyeongshop.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class ReviewWriteServiceImpl implements ReviewWriteService {
	
	@Autowired
	private ReviewWriteDAO dao;
	
	@Override
	public int insert(String reviewContent, String reviewPwd, String userId, int productId) {
		System.out.println("RW_Service_Insert");
		int result = dao.insert(reviewContent, reviewPwd, userId, productId);
		System.out.println("RW_Service_Insert::" + result);
		return result;
	}
	
	
	@Override
	public int reviewPwdCheck(String reviewPwd, int reviewId, String userId) {
		System.out.println("RW_Service_CheckService");
		int result = dao.reviewPwdCheck(reviewPwd, reviewId, userId);
		System.out.println("RW_Service_CheckService's result::" + result);
		return result;
	}

	@Override
	public ReviewDTO getReviewContent(int reviewId) {
		System.out.println("RW_Service_GetReviewContent");
		ReviewDTO review = dao.getReviewContent(reviewId);
		System.out.println("RW_Service_GetReviewContent"+ review);
		return review;
	}


	@Override
	public int reviewUpdate(String content, int reviewId) {
		System.out.println("RW_Service_ReviewUpdate");
		int review = dao.reviewUpdate(content, reviewId);
		System.out.println("RW_Service_ReviewUpdate서비스::" + review);
		return review;
	}


	@Override
	public int reviewDel(int reviewId) {
		System.out.println("ReviewDel_service");
		int review = dao.reviewDel(reviewId);
		System.out.println("ReviewDel서비스::" + review);
		return review;
	}

}
