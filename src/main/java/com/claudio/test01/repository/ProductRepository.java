package com.claudio.test01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudio.test01.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
	public Product findById(int id);
}
