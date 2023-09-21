package com.sesac.oyeongshop.review;

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
		String sql = "select * from tbl_review";
		List<ReviewDTO> review = template.query(sql, new ReviewRowMapper());
		return review;
	}
}
