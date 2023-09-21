package com.sesac.oyeongshop.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.ReviewDTO;

@Repository
public class ReviewWriteDAOImpl implements ReviewWriteDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int insert(String reviewContent) {
		System.out.println("rwDao");
		System.out.println("rwDao");
		String sql = "insert into tbl_review(review_id, content, order_id, parent_id, upload_date,"
				+ "review_pwd, user_id, product_id) "
				 + 	" VALUES (3, ?, 1, 0, sysdate, '1111', 'a1', 1)";
		
		//update,delete,insert는 int로 나옴
		int review = template.update(sql, reviewContent);
		
		return review;
	}
}
