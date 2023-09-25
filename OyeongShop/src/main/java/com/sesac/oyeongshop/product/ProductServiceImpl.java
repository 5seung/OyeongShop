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
	public List<ProductDTO> selectAll(String category) {
		List<ProductDTO> products = category.equals("All") ? dao.selectAll() : dao.selectAll(category);
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

	@Override
	public int insert(ProductDTO productInfo) {
		int result = dao.insert(productInfo);
		return result;
	}
	@Override
	public int insert(int key, String storedFileName) {
		int result = dao.insert(key, storedFileName);
		return result;
	}

	@Override
	public int delete(int productNo) {
		int result = dao.delete(productNo);
		return result;
	}

}
