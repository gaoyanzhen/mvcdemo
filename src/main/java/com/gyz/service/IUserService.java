package com.gyz.service;

import java.util.List;

import com.gyz.po.User;
import com.gyz.util.PageModel;

public interface IUserService {
	public String getUsername(String id);
	public User getUserByName(String name);
	public User getUserById(String id);
	public boolean addUser(User user);
	public List<User> getAllUsers();
	public List<User> getUserByPage(PageModel<User> pageModel);
	public int countAll();
	public void deleteUser(String userId);
}
