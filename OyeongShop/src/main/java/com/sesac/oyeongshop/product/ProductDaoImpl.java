package com.sesac.oyeongshop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.rowmapper.ProductRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	JdbcTemplate template;

	@Override
	public List<ProductDTO> selectAll() {
		String sql = "select * from tbl_product ORDER BY upload_date DESC";
		List<ProductDTO> products = null;
		try {
			products = template.query(sql, new ProductRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return products;
	}

	@Override
	public List<ProductDTO> selectNew() {
		String sql = "select * from tbl_product where upload_date >= SYSDATE - 7";
		List<ProductDTO> products = null;
		try {
			products = template.query(sql, new ProductRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return products;
	}

}
