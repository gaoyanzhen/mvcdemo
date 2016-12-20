package com.gyz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyz.po.User;
import com.gyz.service.IUserService;
import com.gyz.util.PageModel;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userService;
	
	@RequestMapping(params = "action=save")
	public String save(User user,HttpServletRequest request,HttpServletResponse response) {
		String message = "";
		//User user = (User)request.getAttribute("user");
		logger.info("�û���Ϣ��" + user.toString());
		boolean isAdd = userService.addUser(user);
		message = "����ɹ���";
		request.setAttribute("message", message);
		request.setAttribute("user", user);
		String mapping = "register";
		if(!isAdd){
			mapping = "userModify";
		}
		return mapping;
	}
	@RequestMapping(params = "action=delete")
	public String delete(HttpServletRequest request,HttpServletResponse response) {
		String message = "";
		String userId = request.getParameter("userId");
		userService.deleteUser(userId);
		message = "ɾ���ɹ���";
		request.setAttribute("message", message);
		return getUserList(request,response);
	}
	
	@RequestMapping(params = "action=getUserList")
	public String getUserList(HttpServletRequest request,HttpServletResponse response) {
		String page = request.getParameter("page");
		logger.info("��ǰ��" + page);
		int totalRecord = userService.countAll();
		PageModel pageModel = PageModel.newPageModel(5, page, totalRecord);
		List<User> userList = userService.getUserByPage(pageModel);
		pageModel.setDataList(userList);
		request.setAttribute("pageModel", pageModel);
		request.setAttribute("currentPage", pageModel.getCurrentPage());
		
		logger.info("�鿴��¼�û�������" + userList.size());
		return "userList";
	}
	
	@RequestMapping(params = "action=modify")
	public String modify(HttpServletRequest request,HttpServletResponse response) {
		String userId = request.getParameter("userId");
		User user = userService.getUserById(userId);
		logger.info("�û���Ϣ��" + user.toString());
		request.setAttribute("user", user);
		return "userModify";
	}
}
