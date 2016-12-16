package com.gyz.service;

import java.util.List;

import com.gyz.po.User;

public interface IUserService {
	public String getUsername(String id);
	public User getUserByName(String name);
	public void addUser(User user);
	public List<User> getAllUsers();
}
