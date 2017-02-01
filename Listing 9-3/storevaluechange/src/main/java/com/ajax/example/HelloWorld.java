package com.ajax.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld")
@RequestScoped
public class HelloWorld {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHelloMessage() {
		if (userName == null || userName.equals("")) {
			return "";
		} else {
			return "Hello " + userName;
		}
	}

}
