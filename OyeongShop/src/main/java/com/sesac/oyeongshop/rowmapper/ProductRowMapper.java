package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.ProductDTO;

public class ProductRowMapper implements RowMapper<ProductDTO>{

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO product = new ProductDTO(
				rs.getInt(1), 
				rs.getString(2), 
				rs.getInt(3),
				rs.getInt(4),
				rs.getDate(5),
				rs.getString(6),
				rs.getString(7),
				rs.getString(8),
				rs.getString(9)
				);
		return product;
	}

}
