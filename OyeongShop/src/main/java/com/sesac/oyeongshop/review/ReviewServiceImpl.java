package com.sesac.oyeongshop.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO dao;

	@Override
	public List<ReviewDTO> selectAll() {
		List<ReviewDTO> result = dao.selectAll();
		return result;
	}

	@Override
	public List<ReviewDTO> selectAll(String userId) {
		List<ReviewDTO> result = dao.selectAll(userId);
		return result;
	}

	@Override
	public List<ReviewDTO> selectAll(int productNo) {
		List<ReviewDTO> result = dao.selectAll(productNo);
		return result;
	}

	@Override
	public boolean writeCheck(String userId, int productNo) {
		List<Integer> productIds = dao.writeCheck(userId);
		System.out.println(productIds.contains(productNo));

		return productIds.contains(productNo);
	}
}
