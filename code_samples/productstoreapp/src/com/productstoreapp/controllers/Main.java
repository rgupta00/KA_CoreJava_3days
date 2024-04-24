package com.productstoreapp.controllers;

import java.util.List;

import com.productstoreapp.dao.Product;
import com.productstoreapp.service.ProductService;
import com.productstoreapp.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		
		//get all the products and print them
//		printAllProducts(productService);
		
//		Product product=new Product("night laptop", 100);
//		productService.addProduct(product);
		
		//printAllProducts(productService);
		
		//update
		Product product=productService.getById(1);
		product.setPrice(product.getPrice()*1.05);
		productService.updateProduct(1, product);
		printAllProducts(productService);
//		productService.addProduct(product);
	}

	
	
	 static void printAllProducts(ProductService productService) {
		List<Product>products=productService.getAll();
		for(Product product: products) {
			System.out.println(product);
		}
	}

}
