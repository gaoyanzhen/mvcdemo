package com.gyz.controller;

import java.util.Map;

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
		// ÌáÊ¾ÐÅÏ¢
		String message = "";
		String view = "";
		User user = null;
		if (username != null && !"".equals(username)) {
			user = userService.getUserByName(username);
		}

		if (user != null && user.getPassword().equals(password)) {
			message = "»¶Ó­µÇÂ¼ !";
			logger.info("µÇÂ¼³É¹¦£¡");
			view = "index";
		}else{
			message = "ÓÃ»§Ãû»òÃÜÂë´íÎó!";
			logger.error("µÇÂ¼Ê§°Ü£¡");
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

}
