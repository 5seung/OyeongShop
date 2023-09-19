package com.sesac.oyeongshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public int insert() {
		String sql = "INSERT INTO tbl_USER (user_id, pwd, name, use_state, authority, JOIN_DATE)"
				+ "VALUES(?, ?, ?, ?, ?, sysdate)";
		return template.update(sql, "test3","test","tester","Y","구매자");
	}
}
