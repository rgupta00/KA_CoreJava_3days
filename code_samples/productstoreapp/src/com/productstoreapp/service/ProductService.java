package com.productstoreapp.service;

import java.util.List;

import com.productstoreapp.dao.Product;

public interface ProductService {
	public List<Product> getAll();
	public Product getById(int id);
	public void addProduct(Product product);
	public void updateProduct(int id, Product product);
	public void deleteProduct(int id);
}
