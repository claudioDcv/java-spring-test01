package com.claudio.test01.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudio.test01.model.Product;
import com.claudio.test01.repository.ProductRepository;;


@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired(required=false)
	ProductRepository productDAO;

	@Transactional
	@Override
	public List<Product> list() {
		return this.productDAO.findAll();
	}

	@Override
	public Product findById(int id) {
		return this.productDAO.findById(id);
	}
	
	public void add(Product p) {
		this.productDAO.save(p);
	}

}
