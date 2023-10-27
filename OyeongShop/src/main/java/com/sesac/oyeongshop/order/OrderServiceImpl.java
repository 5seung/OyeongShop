package com.sesac.oyeongshop.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public int insert(String userId, String receiveName, String receivePhone, int zonecode, String address, String addressDetail, String addressExtra) {
		int result = dao.insert(userId, receiveName, receivePhone, zonecode, address, addressDetail, addressExtra);
		System.out.println("Order테이블 Insert::result::" + result);
		return result;
	}
	
	@Override
	public int insertDetail(OrderDetailDTO detaildto) {
		System.out.println("OrderService_Insert");
		int orderDetail = dao.insertDetail(detaildto);
		System.out.println("OrderDetail테이블 Insert::result::" + orderDetail);
		return orderDetail;
	}

	@Override
	public OrderDTO getOrderList(int orderId) {
		OrderDTO order = dao.getOrderList(orderId);
		System.out.println("(서비스)getOrderList"+order);
		return order;
	}

	@Override
	public List<OrderDTO> getMyOrder(String userId) {
		List<OrderDTO> myorders = dao.getMyOrder(userId);
		return myorders;
	}
	
}
