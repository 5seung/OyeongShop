package com.sesac.oyeongshop.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.rowmapper.ReviewRowMapper;

@Repository
public class ReviewDAOImpl implements ReviewDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	
	@Override
	public List<ReviewDTO> selectAll() {
		String sql = "select * from tbl_review order by review_id";
		List<ReviewDTO> review = template.query(sql, new ReviewRowMapper());
		System.out.println("reviewdao::"+review);
		return review;
	}
	@Override
	public List<ReviewDTO> selectAll(int productNo) {
		String sql = "select * from tbl_review where PRODUCT_ID = ? order by review_id";
		List<ReviewDTO> reviews = template.query(sql, new ReviewRowMapper(), productNo);
		System.out.println("reviewdao::"+reviews);
		return reviews;
	}
}
