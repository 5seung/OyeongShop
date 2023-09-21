package com.sesac.oyeongshop.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesac.oyeongshop.dto.UserDTO;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	//로그인 화면을 보여주는 메소드
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	//로그인을 실행하는 메소드
	@RequestMapping(value = "/login.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(String userId, String password, HttpServletRequest request, HttpSession session) {
		UserDTO user = null;
		user = service.checkLogin(userId, password);
		String view = "redirect:/";
		if (user != null) {
			System.out.println("login() :: OK :: " + user);
			session.setAttribute("user", user);
		} else {
			request.setAttribute("msg", "로그인 실패");
			view = "redirect:/login";
		}
		return view;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
}
