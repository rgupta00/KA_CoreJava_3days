package com.productstoreapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDaoImpl implements ProductDao{
	
	private Map<Integer, Product> productMap;
	private static int counter=2;
	
	public ProductDaoImpl() {
		productMap=new HashMap<Integer, Product>();
		productMap.put(1, new Product(1, "dell laptop", 5000));
		productMap.put(2, new Product(2, "Rich dad poor dad", 50));
	}
	
	@Override
	public List<Product> getAll() {
		return new ArrayList<>(productMap.values());
	}

	@Override
	public Product getById(int id) {
		return productMap.get(id);
	}

	@Override
	public void addProduct(Product product) {
		product.setId(++counter);
		productMap.put(counter,product );
	}

	@Override
	public void updateProduct(int id, Product product) {
		Product productToUpdate= getById(id);
		if(productToUpdate!=null) {
			productToUpdate.setPrice(product.getPrice());
			productMap.put(id, productToUpdate);
		}
	}

	@Override
	public void deleteProduct(int id) {
		productMap.remove(id);
	}

}
