package com.composititecomponent;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("usercc")
@SessionScoped
public class LoginTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (userName == null || userName.equals("") || password == null || password.equals("")) {
			return "fail";
		} else {
			return "success";
		}
	}
}
