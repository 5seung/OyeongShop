package com.sesac.oyeongshop.product;

import java.util.List;

import com.sesac.oyeongshop.dto.ProductDTO;

public interface ProductDao {

	List<ProductDTO> selectAll();

	List<ProductDTO> selectNew();

}
