package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.AddressDTO;

public class AddressRowMapper implements RowMapper<AddressDTO>{

	@Override
	public AddressDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		AddressDTO address =new AddressDTO(
				rs.getInt(1), 
				rs.getString(2), 
				rs.getInt(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6)
				);
		return address;
	}

}
