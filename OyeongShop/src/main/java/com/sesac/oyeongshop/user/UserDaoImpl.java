package com.sesac.oyeongshop.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sesac.oyeongshop.dto.UserDTO;
import com.sesac.oyeongshop.rowmapper.UserRowMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public UserDTO Login(String user_id, String password) {
		UserDTO user = null;
		try {
			user = template.queryForObject("select * from tbl_USER where user_id = ? and pwd= ?", new Object[]{user_id, password}, new UserRowMapper());
		} catch (EmptyResultDataAccessException e) {
			System.out.println("login 실패");
		}
		return user;
	}

}
