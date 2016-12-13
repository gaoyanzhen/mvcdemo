package com.gyz.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public String getPassword(String username) {
		String password = "";
		if("admin".equals(username)){
			password = "123";
		}
		return password;
	}
}
