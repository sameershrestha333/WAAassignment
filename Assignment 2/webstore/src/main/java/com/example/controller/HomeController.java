package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String home(){
//		
//		return "redirect:/welcome";
//	}
//	@RequestMapping(value="/welcome",method=RequestMethod.GET)
//	public String welcome(Model model){
//		model.addAttribute("greeting", "Welcome to our web store!"); 
//		model.addAttribute("tagline", "You will get everyting you need.");
//		return "welcome";
//
//		
//	}
	
	@RequestMapping("/")
	public String home(){
		
		return "redirect:/welcome";
	}
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome(Model model){
	//	model.addAttribute("greeting", "Welcome to our web store!"); 
		//model.addAttribute("tagline", "You will get everyting you need.");
		return "index";

		
	}

}
