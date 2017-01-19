package com.example.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.Productdao;
import com.example.model.Product;
import com.example.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private Productdao Productdao;
	
	@Autowired
	private ProductService productService;
	@RequestMapping("/products")
	public String getAllProducts(Model model){
		List<Product> list=Productdao.getAllProducts();
		System.out.println(list);
		model.addAttribute("products",Productdao.getAllProducts());
		
		return "products";
	}
	
	
	
	
//	@RequestMapping("/viewProduct/{productId}")
//    public String viewProduct(@PathVariable("productId") int productId,Model model) throws IOException{
//        Product product=productService.getProductById(productId);
//        model.addAttribute("product",product);
//
//
//        return "viewProduct";
//    }
	
	@RequestMapping("viewProduct/{productId}")
	public String viewProduct(@PathVariable("productId") String productId, Model model) throws IOException{
			
		Product product=productService.getProductById(productId);
		model.addAttribute("product",product);
		return "viewProduct";
	}
	
	

}
