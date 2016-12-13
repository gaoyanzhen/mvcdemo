package com.gyz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyz.po.User;
import com.gyz.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private IUserService userService;

	@RequestMapping
	public String showHome() {
		String view = "";
		view = "login";
		return view;
	}
	
	@RequestMapping(params = "action=login")
	public String login(String username, String password, Map<String,Object> model) {

		// 提示信息
		String message = "";
		String view = "";
		User user = null;
		if (username != null && !"".equals(username)) {
			user = userService.getUserByName(username);
		}

		if (user != null && user.getPassword().equals(password)) {
			message = "欢迎登录 !";
			view = "index";
		}else{
			message = "用户名或密码错误!";
			view = "login";
		}
		model.put("message", message);
		return view;
	}

	@RequestMapping(params = "action=register")
	public String register(ModelMap model) {
		return "register";
	}

}
