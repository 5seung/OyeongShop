package com.sesac.oyeongshop.user;

import com.sesac.oyeongshop.dto.UserDTO;

public interface UserDao {

	UserDTO Login(String user_id, String password);

}
