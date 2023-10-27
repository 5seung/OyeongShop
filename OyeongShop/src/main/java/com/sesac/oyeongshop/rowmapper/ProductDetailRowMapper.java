package com.sesac.oyeongshop.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ProductImgDTO;

public class ProductDetailRowMapper implements RowMapper<ProductDetailDTO>{

	@Override
	public ProductDetailDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDetailDTO productDetail = new ProductDetailDTO(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getInt(5)
				);
		return productDetail;
	}


}