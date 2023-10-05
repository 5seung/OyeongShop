package com.sesac.oyeongshop.review;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	public List<ReviewDTO> selectAll(String userId) {
		String sql = "select * from tbl_review where user_id = ? order by review_id";
		List<ReviewDTO> review = template.query(sql, new ReviewRowMapper(), userId);
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
	
	@Override
	public List<Integer> writeCheck(String userId) {
		String sql = "select product_id from tbl_order_detail"
				+ " where order_id IN (SELECT order_id FROM tbl_order WHERE user_id=?)";
		List<Integer> writechecks = template.query(sql, new RowMapper<Integer>() {
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException{
				return rs.getInt(1);
			}
		}
		, userId
					);
		System.out.println("writechecks DAO!!!!::"+writechecks);
		return writechecks;
	}
}
