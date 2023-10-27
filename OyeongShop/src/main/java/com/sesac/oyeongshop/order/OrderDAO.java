package com.sesac.oyeongshop.order;
import java.util.List;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;

public interface OrderDAO {
	public int insert(String userId, String receiveName, String receivePhone, int zonecode, String address, String addressDetail, String addressExtra);

	public OrderDTO getOrderList(int orderId);

	public int insertDetail(OrderDetailDTO detaildto);

	public List<OrderDTO> getMyOrder(String userId);
	
}
