package com.gyz.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyz.po.User;
import com.gyz.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
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
		logger.debug(LoginController.class.toString());
		// 提示信息
		String message = "";
		String view = "";
		User user = null;
		if (username != null && !"".equals(username)) {
			user = userService.getUserByName(username);
		}

		if (user != null && user.getPassword().equals(password)) {
			message = "欢迎登录 !";
			logger.info("登录成功！");
			view = "index";
		}else{
			message = "用户名或密码错误!";
			logger.error("登录失败！");
			view = "login";
		}
		model.put("message", message);
		return view;
	}

	@RequestMapping(params = "action=register")
	public String register(ModelMap model) {
		return "register";
	}
	
	@RequestMapping(params = "action=opinion")
	public String opinion(ModelMap model) {
		return "opinion";
	}
	
	@RequestMapping(params = "action=content")
	public String content(HttpServletRequest request,HttpServletResponse response) {
		List<User> userList = userService.getAllUsers();
		request.setAttribute("userList", userList);
		logger.info("查看登录用户个数：" + userList.size());
		return "userList";
	}

}
