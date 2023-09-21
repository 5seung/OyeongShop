package com.sesac.oyeongshop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Override
	public List<ProductDTO> selectAll() {
		List<ProductDTO> products = dao.selectAll();
		return products;
	}

	@Override
	public List<ProductDTO> selectNew() {
		List<ProductDTO> products = dao.selectNew();
		return products;
	}

	@Override
	public ProductDTO select(int productNo) {
		ProductDTO product = dao.selectOne(productNo);
		return product;
	}

}
