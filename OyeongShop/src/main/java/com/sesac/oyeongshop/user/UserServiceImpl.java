package com.sesac.oyeongshop.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesac.oyeongshop.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;
	
	public UserDTO checkLogin(String user_id, String password) {
		UserDTO user = null;
		user = dao.Login(user_id, password);
		return user;
	}

}
