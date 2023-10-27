package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.OrderDTO;

public class OrderRowMapper implements RowMapper<OrderDTO>{

	@Override
	public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderDTO order = new OrderDTO(
				rs.getInt(1), 
				rs.getString(2), 
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getDate(6),
				rs.getInt(7),
				rs.getString(8),
				rs.getString(9),
				rs.getString(10)
				);
		return order;
	}
}
