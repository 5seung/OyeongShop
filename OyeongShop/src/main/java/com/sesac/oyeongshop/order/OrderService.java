package com.sesac.oyeongshop.order;

import com.sesac.oyeongshop.dto.ReviewDTO;

public interface OrderService {

	public int insert(String userId, String receiveName, String receivePhone);	//쓰기
		
}
