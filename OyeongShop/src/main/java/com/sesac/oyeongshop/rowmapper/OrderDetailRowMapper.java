package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;

public class OrderDetailRowMapper implements RowMapper<OrderDTO>{

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
		//int orderQuantity, String orderColor, String orderSize, int price
		OrderDetailDTO orderdetail =  new OrderDetailDTO(
				rs.getInt(11),
				rs.getString(12),
				rs.getString(13),
				rs.getInt(14)
				);
		order.setOrderdetail(orderdetail);
		return order;
	}
}
