package com.sesac.oyeongshop.review;

import java.util.List;

import com.sesac.oyeongshop.dto.ReviewDTO;

public interface ReviewService {

	 public List<ReviewDTO> selectAll();	//쓰기
//	 상품의 모든 리뷰리스트 출력
	 public List<ReviewDTO> selectAll(int productNo);
}
