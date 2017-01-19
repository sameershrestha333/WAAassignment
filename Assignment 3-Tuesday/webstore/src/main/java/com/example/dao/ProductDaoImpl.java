package com.example.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository
public class ProductDaoImpl implements Productdao {
	private List<Product> productsList = new ArrayList<Product>();

	@Override
	public List<Product> getAllProducts() {
		return productsList;
	}

	public ProductDaoImpl() {

		Product iphone = new Product();
		iphone.setProductId("101");
		iphone.setName("iphone 7");
		iphone.setUnitPrice(new BigDecimal(600));
		iphone.setDescription("Latest iphone");
		iphone.setManufacturer("Apple");
		iphone.setCategory("phone");
		iphone.setUnitsInStock(300);
		iphone.setUnitsInOrder(20);
		iphone.setDiscontinued(false);
		iphone.setCondition("good");
		
		
		
		Product labtop = new Product();
		labtop.setProductId("102");
		labtop.setName("Dell inspirin");
		labtop.setUnitPrice(new BigDecimal(450));
		labtop.setDescription("intel CORE i7");
		labtop.setManufacturer("Dell");
		labtop.setCategory("Labtop");
		labtop.setUnitsInStock(25);
		labtop.setUnitsInOrder(2);
		labtop.setDiscontinued(false);
		labtop.setCondition("good");
		
		Product mobile = new Product();
		mobile.setProductId("103");
		mobile.setName("Samsung galaxy");
		mobile.setUnitPrice(new BigDecimal(250));
		mobile.setDescription("Touch Screen");
		mobile.setManufacturer("Samsung");
		mobile.setCategory("Mobile");
		mobile.setUnitsInStock(40);
		mobile.setUnitsInOrder(5);
		mobile.setDiscontinued(false);
		mobile.setCondition("new");
		
		
		
		Product watch = new Product();
		watch.setProductId("104");
		watch.setName("Omega Z4");
		watch.setUnitPrice(new BigDecimal(750));
		watch.setDescription("Italian Design");
		watch.setManufacturer("Omega");
		watch.setCategory("Labtop");
		watch.setUnitsInStock(50);
		watch.setUnitsInOrder(2);
		watch.setDiscontinued(false);
		watch.setCondition("good");
		
		
		
		productsList.add(iphone);
		productsList.add(labtop);
		productsList.add(mobile);
		productsList.add(watch);

	}

	@Override
	public Product getProductById(String productId) {
		Product product = null;

		if (productId != null) {

			for (Product p : productsList) {
				if (p != null && p.getProductId().equals(productId)) {
					product = p;
					break;
				}
			}
			if(product==null){
				throw new IllegalArgumentException("No result with product Id :"+ productId);
			}

		} else {
			throw new IllegalArgumentException("Product Id is null");
		}
		return product;
	}

}
