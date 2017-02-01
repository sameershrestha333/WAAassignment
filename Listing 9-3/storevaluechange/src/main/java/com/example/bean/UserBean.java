package com.example.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String Id;
	private String name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String addUser(){
		System.out.println("action:::::::::User added successfully!");
		return "show";
	}
	
	public void changeLabelUI(ActionEvent event){
		System.out.println("action listener:::::some action and UI is changed");
	}
	
	public void changeIdLabel(ValueChangeEvent e){

		System.out.println("Valuechanedevent::::::label of id is changed");
	}
	
	public void colorMe(ComponentSystemEvent cse){
		HtmlOutputText outputText=(HtmlOutputText) cse.getComponent();
		int value=Integer.parseInt(outputText.getValue().toString());
		if(value==50){
			outputText.setStyle("color:red");
		}
	}
	

}
