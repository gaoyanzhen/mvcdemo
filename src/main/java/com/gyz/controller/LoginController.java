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

		// ��ʾ��Ϣ
		String message = "";
		String view = "";
		User user = null;
		if (username != null && !"".equals(username)) {
			user = userService.getUserByName(username);
		}

		if (user != null && user.getPassword().equals(password)) {
			message = "��ӭ��¼ !";
			view = "index";
		}else{
			message = "�û������������!";
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
