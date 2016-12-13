package com.gyz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyz.po.User;
import com.gyz.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(params = "action=save")
	public String save(HttpServletRequest request,HttpServletResponse response) {
		String message = "";
		User user = new User();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		user.setName(name);
		user.setPassword(password);
		user.setAge(age);
		user.setAddress(address);
		userService.addUser(user);
		message = "±£´æ³É¹¦£¡";
		request.setAttribute("message", message);
		return "register";
	}
}
