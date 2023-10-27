package com.sesac.oyeongshop.order;

import java.util.List;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;

public interface OrderService {

	public int insert(String userId, String receiveName, String receivePhone, int zonecode,String address, String addressDetail, String addressExtra);

	public OrderDTO getOrderList(int orderId);

	//select만 dto같은 객체로받고 insert delete update는 int
	public int insertDetail(OrderDetailDTO detaildto);

	public List<OrderDTO> getMyOrder(String userId);
}
