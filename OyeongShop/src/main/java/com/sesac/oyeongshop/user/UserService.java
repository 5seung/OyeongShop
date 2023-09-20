package com.sesac.oyeongshop.user;

import com.sesac.oyeongshop.dto.UserDTO;

public interface UserService {

	UserDTO checkLogin(String user_id, String password);

}
