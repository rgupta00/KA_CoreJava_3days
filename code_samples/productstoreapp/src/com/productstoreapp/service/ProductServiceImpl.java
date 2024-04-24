package com.productstoreapp.service;

import java.util.List;

import com.productstoreapp.dao.Product;
import com.productstoreapp.dao.ProductDao;
import com.productstoreapp.dao.ProductDaoImpl;
import com.productstoreapp.exceptions.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	
	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAll() {
		//extra logic
		return productDao.getAll();
	}

	@Override
	public Product getById(int id) {
		Product product=productDao.getById(id);
		if(product==null)
			throw new ProductNotFoundException("product with id "+ id +" is not found");
		return product;
	}

	@Override
	public void addProduct(Product product) {
		//i can do data validation
//		if(product.getPrice()<10)
//			throw new SomeEx();
		productDao.addProduct(product);
	}

	@Override
	public void updateProduct(int id, Product product) {
		productDao.updateProduct(id, product);
	}

	@Override
	public void deleteProduct(int id) {
		
		productDao.deleteProduct(id);
	}

}
