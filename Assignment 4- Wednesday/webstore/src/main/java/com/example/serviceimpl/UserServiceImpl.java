package com.example.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean authenticate(User user) {
		
		if(user.getUser_name().equals("admin")&&user.getPassword().equals("test123"))
		{
			return true;
		}
		return false;
	}

}
