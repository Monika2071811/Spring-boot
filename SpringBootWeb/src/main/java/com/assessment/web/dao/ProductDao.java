package com.assessment.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assessment.web.model.Product;
import com.assessment.web.repository.ProductRepository;
import com.assessment.web.service.ProductService;

@Repository
public class ProductDao implements ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		return product;
	}

	public ArrayList<Product> getAllProduct() {
		 ArrayList<Product> p =(ArrayList<Product>)productRepository.findAll();
		return p;
	}

}
