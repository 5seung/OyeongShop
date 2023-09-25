package com.sesac.oyeongshop.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.rowmapper.ReviewRowMapper;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(String userId, String receiveName, String receivePhone) {
		System.out.println("ORDER DAO"); 

		// order_state는 default값 들어가니까 insert에 생략!
		String sql = "INSERT INTO tbl_order (order_id, user_id, address_id, receive_name,"
				+ "receive_phone, order_date)\r\n"
				+ "VALUES (NVL((SELECT MAX(order_id) + 1 FROM tbl_order), ?, 1, ?, ?, SYSDATE)";
		// update,delete,insert는 int로 나옴
		int review = template.update(sql, userId, receiveName, receivePhone);
		return review;
	}

}