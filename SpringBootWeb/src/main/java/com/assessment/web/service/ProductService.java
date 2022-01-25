package com.assessment.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.web.model.Product;

@Service

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProduct();


}
