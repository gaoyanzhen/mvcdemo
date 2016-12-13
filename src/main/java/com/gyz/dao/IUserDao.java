package com.gyz.dao;

import com.gyz.po.User;

public interface IUserDao {
	public String getUsername(String id);
	public User getUserByName(String name);
	public void addUser(User user);
	public int countAll();
}
