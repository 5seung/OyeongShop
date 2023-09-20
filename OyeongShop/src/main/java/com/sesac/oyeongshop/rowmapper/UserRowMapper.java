package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.UserDTO;

public class UserRowMapper implements RowMapper<UserDTO>{

	@Override
	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDTO user = new UserDTO(
				rs.getString(1), 
				rs.getString(2), 
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getDate(6),
				rs.getString(7),
				rs.getString(8));
		return user;
	}

}
