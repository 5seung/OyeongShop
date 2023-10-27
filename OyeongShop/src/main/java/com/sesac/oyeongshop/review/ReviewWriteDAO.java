package com.sesac.oyeongshop.review;

import com.sesac.oyeongshop.dto.ReviewDTO;

public interface ReviewWriteDAO {
	public int insert(String reviewContent, String reviewPwd, String userId, int productId);

	public int reviewPwdCheck(String reviewPwd, int reviewId, String userId);

	public ReviewDTO getReviewContent(int reviewId);

	public int reviewUpdate(String content, int reviewId);

	public int reviewDel(int reviewId);

}
