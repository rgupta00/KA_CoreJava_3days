package com.productstoreapp.dao;
import java.util.*;
public interface ProductDao {

	public List<Product> getAll();
	public Product getById(int id);
	public void addProduct(Product product);
	public void updateProduct(int id, Product product);
	public void deleteProduct(int id);
}
