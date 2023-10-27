package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.ProductImgDTO;

public class ProductImgRowMapper implements RowMapper<ProductImgDTO>{

	@Override
	public ProductImgDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductImgDTO productImg = new ProductImgDTO(
				rs.getInt(1),
				rs.getString(2),
				rs.getInt(3)
				);
		return productImg;
	}


}