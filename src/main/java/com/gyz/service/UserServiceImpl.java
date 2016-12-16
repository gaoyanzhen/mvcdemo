package com.gyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyz.dao.IUserDao;
import com.gyz.po.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;

	public String getUsername(String id) {
		return userDao.getUsername(id);
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
