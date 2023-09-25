package com.sesac.oyeongshop.order;
import com.sesac.oyeongshop.dto.ReviewDTO;

public interface OrderDAO {
	public int insert(String userId, String receiveName, String receivePhone);
	
	
}
