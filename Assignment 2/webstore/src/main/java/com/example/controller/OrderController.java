package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/order/{productId}/{count}")
	public String processOrder(@PathVariable String productId,@PathVariable("count") int qty){

		orderService.processOrder(productId, qty);;
		return "redirect:/products";
	}
	
}
