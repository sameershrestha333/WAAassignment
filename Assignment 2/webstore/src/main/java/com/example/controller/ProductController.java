package com.example.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.Productdao;
import com.example.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private Productdao Productdao;
	
	@RequestMapping("/products")
	public String getAllProducts(Model model){
//		List<Product> products=new ArrayList<>();
//		
//		Product iphone=new Product();
//		iphone.setProductId("101");
//		iphone.setName("iphone 7");
//		iphone.setUnitPrice(new BigDecimal(600));
//		iphone.setDescription("Latest iphone");
//		iphone.setManufacturer("Apple");
//		iphone.setCategory("phone");
//		iphone.setUnitsInStock(300);
//		iphone.setUnitsInOrder(20);
//		iphone.setDiscontinued(false);
//		iphone.setCondition("good");
//		
//		products.add(iphone);
		List<Product> list=Productdao.getAllProducts();
		System.out.println(list);
		model.addAttribute("products",Productdao.getAllProducts());
		
		return "products";
	}
	
	

}
