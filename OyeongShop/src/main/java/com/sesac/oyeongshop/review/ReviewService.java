package com.sesac.oyeongshop.review;

import java.util.List;

import com.sesac.oyeongshop.dto.ReviewDTO;

public interface ReviewService {
	public List<ReviewDTO> selectAll();
//	본인이 작성한 리뷰 모아보기
	public List<ReviewDTO> selectAll(String userId);

//	 상품의 모든 리뷰리스트 출력
	public List<ReviewDTO> selectAll(int productNo);

	public boolean writeCheck(String userId, int productNo);
}
