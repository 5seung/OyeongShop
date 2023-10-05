package com.sesac.oyeongshop.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.OrderDTO;
import com.sesac.oyeongshop.dto.OrderDetailDTO;
import com.sesac.oyeongshop.dto.ReviewDTO;
import com.sesac.oyeongshop.rowmapper.OrderDetailRowMapper;
import com.sesac.oyeongshop.rowmapper.OrderRowMapper;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(String userId, String receiveName, String receivePhone, int zonecode, String address, String addressDetail, String addressExtra) {
		System.out.println("ORDER DAO::");

		// order_state는 default값 들어가니까 insert에 생략!
		String sql = "INSERT INTO tbl_order (order_id, user_id, receive_name, receive_phone, order_state, order_date,"
				+ "zonecode, address, address_detail, address_extra)"
				+ "VALUES (NVL((SELECT MAX(order_id) + 1 FROM tbl_order),1), ?, ?, ?, '결제완료', sysdate, ?, ?, ?, ?)";
		// update,delete,insert는 int로 나옴
		KeyHolder keyHolder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "order_id" });
				pstmt.setString(1, userId);
				pstmt.setString(2, receiveName);
				pstmt.setString(3, receivePhone);
				pstmt.setInt(4, zonecode);
				pstmt.setString(5, address);
				pstmt.setString(6, addressDetail);
				pstmt.setString(7, addressExtra);
				return pstmt;
			}
		}, keyHolder);
		int orderId = keyHolder.getKey().intValue();
		return orderId;
	}
	
	@Override
	public int insertDetail(OrderDetailDTO detaildto) {
		System.out.println("ORDER_DETAIL DAO::");

		// order_state는 default값 들어가니까 insert에 생략!
		String sql = "INSERT INTO tbl_order_detail (order_detail_id, order_quantity, order_id, product_id, order_color, order_size, price)"
				+ "VALUES (NVL((SELECT MAX(order_detail_id) + 1 FROM tbl_order_detail),1), ?, ?, ?, ?, ?, ?)";
		// update,delete,insert는 int로 나옴
		int orderDetail = template.update(sql, detaildto.getOrderQuantity(), detaildto.getOrderId(),
				detaildto.getProductId(), detaildto.getOrderColor(), detaildto.getOrderSize(), detaildto.getPrice());
		return orderDetail;
	}

	@Override
	public OrderDTO getOrderList(int orderId) {
		String sql = "SELECT * FROM TBL_ORDER WHERE ORDER_ID=?";
		OrderDTO order = null;
		order = template.queryForObject(sql, new OrderRowMapper(), orderId);
		System.out.println("(DAO)주문내역 SELECT::"+order);
		return order;
	}

	@Override
	public List<OrderDTO> getMyOrder(String userId) {
		String sql = "select o.*, od.order_quantity, od.order_color, od.order_size, od.price"
			+ " FROM tbl_order o"
			+ "	JOIN tbl_order_detail od ON o.order_id = od.order_id"
			+ " WHERE o.user_id=?";

		List<OrderDTO> myorders = template.query(sql, new OrderDetailRowMapper(), userId);
		System.out.println("(DAO)내주문내역!! SELECTALL::"+myorders);
		return myorders;
	}
	
}