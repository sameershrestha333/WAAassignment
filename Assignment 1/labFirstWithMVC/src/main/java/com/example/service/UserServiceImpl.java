package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean authenticate(String username, String password) {
		
		if(username.equals("admin")&&password.equals("test123"))
		{
			return true;
		}
		return false;
	}

}
