package com.gyz.service;

import com.gyz.po.User;

public interface IUserService {
	public String getUsername(String id);
	public User getUserByName(String name);
	public void addUser(User user);
}
