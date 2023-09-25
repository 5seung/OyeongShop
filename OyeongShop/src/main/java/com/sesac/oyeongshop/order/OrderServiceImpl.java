package com.sesac.oyeongshop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public int insert(String userId, String receiveName, String receivePhone) {
		System.out.println("OrderService_Insert");
		int result = dao.insert(userId, receiveName, receivePhone);
		System.out.println("OrderService_Insert::result::" + result);
		return result;
	}
	
}
