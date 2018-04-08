package com.claudio.test01.service;

import java.util.List;

import com.claudio.test01.model.Product;

public interface ProductService {
	public void add(Product product);
	//public void update(Product p);
	public List<Product> list();
	public Product findById(int id);
	//public void remove(int id);
}
