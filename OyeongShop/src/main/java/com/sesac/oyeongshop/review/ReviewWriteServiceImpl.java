package com.sesac.oyeongshop.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class ReviewWriteServiceImpl implements ReviewWriteService {
	@Autowired
	private ReviewWriteDAO dao;


//	@Override
//	public ReviewDTO insert(ReviewDTO dto) {
		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Override
	public int insert(String reviewContent) {
		int result = dao.insert(reviewContent);
		System.out.println(result);
		return result;
	}
	

}
