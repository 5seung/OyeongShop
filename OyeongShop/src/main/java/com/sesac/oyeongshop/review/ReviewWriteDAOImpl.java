package com.sesac.oyeongshop.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.rowmapper.ReviewRowMapper;

@Repository
public class ReviewWriteDAOImpl implements ReviewWriteDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(String reviewContent, String reviewPwd, String userId, int productId) {
		/* System.out.println("rwDao"); */

		String sql = "INSERT INTO tbl_review "
				+ "VALUES (NVL((SELECT MAX(review_id) + 1 FROM tbl_review),1), ?, 1, 0, SYSDATE, ?, ?, ?)";

		// update,delete,insert는 int로 나옴
		int review = template.update(sql, reviewContent, reviewPwd, userId, productId);
		return review;
	}

	@Override
	public int reviewPwdCheck(String reviewPwd, int reviewId, String userId) {
		String sql = "select count(*) from tbl_review where review_pwd=? and review_id=? and user_id=?";
		int result = template.queryForInt(sql, reviewPwd, reviewId, userId);
		return result;
	}

	@Override
	public ReviewDTO getReviewContent(int reviewId) {
		String sql = "select * from tbl_review where review_id=?";
		ReviewDTO review = template.queryForObject(sql, new ReviewRowMapper(), reviewId);

		System.out.println("리뷰컨텐츠" + review.getContent());
		return review;
	}

	@Override
	public int reviewUpdate(String content, int reviewId) {
		String sql = "UPDATE tbl_review SET content = ? WHERE review_id = ?";

		int review = template.update(sql, content, reviewId);

		/* int review = template.update(sql, content, reviewId); */
		/*
		 * ReviewDTO review = template.queryForObject(sql,new
		 * ReviewRowMapper(),reviewId);
		 */
		System.out.println("DAO리뷰업데이트성공하면1::" + review);
		return review;
	}

	@Override
	public int reviewDel(int reviewId) {
		String sql = "DELETE tbl_review WHERE review_id=?";
		int review = template.update(sql, reviewId);
		System.out.println("DAO리뷰삭제성공하면1::" + review);
		return review;
	}

}