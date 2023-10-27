package com.sesac.oyeongshop.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ProductDTO;
import com.sesac.oyeongshop.dto.ProductDetailDTO;
import com.sesac.oyeongshop.dto.ProductImgDTO;
import com.sesac.oyeongshop.rowmapper.ProductDetailRowMapper;
import com.sesac.oyeongshop.rowmapper.ProductImgRowMapper;
import com.sesac.oyeongshop.rowmapper.ProductRowMapper;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<ProductDTO> selectAll() {
		String sql = "select * from tbl_product where sales_status = 'y' ORDER BY upload_date DESC";
		List<ProductDTO> products = null;
		try {
			products = template.query(sql, new ProductRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return products;
	}

	@Override
	public List<ProductDTO> selectAll(String category) {
		String sql = category.equals("All")
				? "select * from tbl_product where sales_status = 'y' ORDER BY upload_date DESC"
				: "select * from tbl_product where category = ? and sales_status = 'y' ORDER BY upload_date DESC";
		List<ProductDTO> products = null;
		try {
			products = template.query(sql, new ProductRowMapper(), category);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return products;
	}

	@Override
	public List<ProductDTO> selectNew() {
		String sql = "select * from tbl_product where upload_date >= SYSDATE - 7 ORDER BY upload_date DESC";
		List<ProductDTO> products = null;
		try {
			products = template.query(sql, new ProductRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return products;
	}

	@Override
	public ProductDTO selectOne(int productNo) {
		String sql = "select * from tbl_product where product_id= ?";
		ProductDTO product = null;
		try {
			product = template.queryForObject(sql, new ProductRowMapper(), productNo);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
		}
		return product;
	}

	@Override
	public List<ProductImgDTO> selectImgs(int productNo) {
		String sql = "select * from tbl_productImg where product_id= ?";
		try {
			List<ProductImgDTO> productImg = template.query(sql, new ProductImgRowMapper(), productNo);
			return productImg;
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품조회 실패");
			return null;
		}
	}
	@Override
	public List<ProductDetailDTO> selectDetail(int productNo) {
		String sql = "select * from tbl_product_detail where product_id= ?";
		List<ProductDetailDTO> productDetail = template.query(sql, new ProductDetailRowMapper(), productNo);
		return productDetail;
	}
	//상품 정보 저장
	@Override
	public int insert(ProductDTO productInfo) {
		/* id, 상품명, 원가, 판매가, 등록일, 카테고리, 판매여부 */
		String sql = "insert into tbl_product "
				+ "values (NVL((SELECT MAX(product_id) + 1 FROM tbl_product),1), ?, ?, ?, sysdate, ?, 'y',?,?)";
		try {
			/*
			 * template.update(sql, productInfo.getName(), productInfo.getProductionCost(),
			 * productInfo.getPrice(), productInfo.getCategory(),
			 * productInfo.getProductContent());
			 */
			KeyHolder keyHolder = new GeneratedKeyHolder();
			template.update(new PreparedStatementCreator() {
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "product_id" });
					pstmt.setString(1, productInfo.getName());
					pstmt.setInt(2, productInfo.getProductionCost());
					pstmt.setInt(3, productInfo.getPrice());
					pstmt.setString(4, productInfo.getCategory());
					pstmt.setString(5, productInfo.getProductContent());
					pstmt.setString(6, productInfo.getMainImg());

					return pstmt;
				}
			}, keyHolder);
			productInfo.setProductId(keyHolder.getKey().intValue());
			return productInfo.getProductId();
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품등록 실패");
			return 0;
		}
	}

//	상품상세 이미지 추가
	@Override
	public int insert(int key, String storedFileName) {
		String sql = "insert into tbl_productImg "
				+ "values (NVL((SELECT MAX(product_img_id) + 1 FROM tbl_ProductImg),1), ?, ?)";
		int result = 0;
		try {
			result = template.update(sql, storedFileName, key);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품이미지 저장 실패");
		}
		return result;
	}

//	상품 상세정보 추가
	@Override
	public int insert(int key, ProductDetailDTO productDetail) {
		String sql = "insert into tbl_product_detail "
				+ "values (NVL((SELECT MAX(product_detail_id) + 1 FROM tbl_product_detail),1), ?, ?, ?, ?)";
		int result = 0;
		try {
			result = template.update(sql, productDetail.getColor(), productDetail.getSizeOption(),
					productDetail.getStock(), key);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품상세 저장 실패");
		}
		return result;
	}

//	상품관련 정보 모두 삭제
	@Override
	public int delete(int productId) {
		String sql1 = "delete from tbl_ProductImg where product_id = ?";
		String sql2 = "delete from tbl_product_detail where product_id = ?";
		String sql3 = "delete from tbl_product where product_id = ?";
		int result = 0;
		try {
			result = template.update(sql1, productId);
			result = template.update(sql2, productId);
			result = template.update(sql3, productId);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("상품삭제 실패");
		}
		return result;
	}

}
