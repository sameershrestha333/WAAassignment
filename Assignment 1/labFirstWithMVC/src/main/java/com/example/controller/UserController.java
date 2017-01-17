package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home(){
		return "login";
	}
//	@RequestMapping("/")
//	public String home1(){
//		
//		return "redirect:/login";
//	}
	
//	@RequestMapping("/login")
//	public String index(){
//		
//		return "login";
//	}
	
	
	@RequestMapping(value= "/welcome", method=RequestMethod.POST)
	public String getWelcome(@RequestParam("username") String username,@RequestParam("password") String password,Model model){
		User user=new User();
		user.setUser_name(username);
		user.setPassword(password);
		if(userService.authenticate(user.getUser_name(), user.getPassword())){
			System.out.println("888888888888888888888888888888888888888888888888888888");

		model.addAttribute("user_name",username);	
		return "welcome";
		}
		else{
			model.addAttribute("msg", "Username and/or password incorrect.");
			return "login";
		}
	}

}
