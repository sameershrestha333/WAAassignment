package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface Productdao {
	List<Product> getAllProducts();
	Product getProductById(String productId);
}
