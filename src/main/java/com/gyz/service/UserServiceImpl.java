package com.gyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyz.dao.IUserDao;
import com.gyz.po.User;
import com.gyz.util.PageModel;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;

	public String getUsername(String id) {
		return userDao.getUsername(id);
	}

	public boolean addUser(User user) {
		User u = userDao.getUserById(String.valueOf(user.getId()));
		boolean isAdd = true;
		if(u == null){
			userDao.addUser(user);
		} else {
			userDao.updateUser(user);
			isAdd = false;
		}
		return isAdd;
	}

	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public List<User> getUserByPage(PageModel<User> pageModel) {
		return userDao.getUserByPage(pageModel.getStartRow(),pageModel.getEndRow());
	}

	public int countAll() {
		return userDao.countAll();
	}

	public void deleteUser(String userId) {
		userDao.deleteUser(userId);
	}

	public User getUserById(String id) {
		return userDao.getUserById(id);
	}
}
