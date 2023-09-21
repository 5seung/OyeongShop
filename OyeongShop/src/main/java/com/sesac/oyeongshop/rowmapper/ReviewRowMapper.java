package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.sesac.oyeongshop.dto.ReviewDTO;

//ReviewDAOImpl에서 객체 생성해서 사용중
public class ReviewRowMapper implements RowMapper<ReviewDTO> {

	@Override
	public ReviewDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReviewDTO rdto = new ReviewDTO(
				rs.getInt(1),
				rs.getString(2),
				rs.getInt(3),
				rs.getInt(4),
				rs.getDate(5),
				rs.getString(6),
				rs.getString(7),
				rs.getInt(8)
				);
		return null;
	}	
}