package com.assessment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.web.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
	
	Product findByProductName(String productName);

}
