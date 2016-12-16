package com.gyz.dao;

import java.util.List;

import com.gyz.po.User;

public interface IUserDao {
	public String getUsername(String id);
	public User getUserByName(String name);
	public void addUser(User user);
	public int countAll();
	public List<User> getAllUsers();
}
