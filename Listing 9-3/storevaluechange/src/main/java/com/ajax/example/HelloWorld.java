package com.ajax.example;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "helloWorld")
@RequestScoped
public class HelloWorld {
	private String userName;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public void validateName(FacesContext fc, UIComponent c, Object value) {
		if (((String) value).contains("_")) {

			throw new ValidatorException(new FacesMessage("Name cannot contain underscores)"));

		}
		if (((String) value).equals("")) {

			throw new ValidatorException(new FacesMessage("Name cannot be empty)"));

		}

		if (((String) value).equals("admin")) {

			throw new ValidatorException(new FacesMessage("Such username already exits!)"));

		}
	}
}
