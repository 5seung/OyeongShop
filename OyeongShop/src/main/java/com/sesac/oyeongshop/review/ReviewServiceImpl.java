package com.sesac.oyeongshop.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO dao;


//	@Override44
//	public ReviewDTO insert(ReviewDTO dto) {
		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public List<ReviewDTO> selectAll() {
		List<ReviewDTO> result = dao.selectAll();
		System.out.println("reviewserviceImpl::"+result);
		return result;
	}
	@Override
	public List<ReviewDTO> selectAll(int productNo) {
		List<ReviewDTO> result = dao.selectAll(productNo);
		System.out.println("reviewserviceImpl::"+result);
		return result;
	}
}
