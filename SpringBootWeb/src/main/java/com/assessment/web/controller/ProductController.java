package com.assessment.web.controller;


import java.sql.Array;
import java.util.ArrayList;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.web.dao.ProductDao;
import com.assessment.web.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="/add")
	public Product addProduct(@RequestBody Product prdt) {
		productDao.addProduct(prdt);
		return prdt;
		
	}
	
	 @RequestMapping(value="/v1/get/info")
	    public ArrayList<Product> getAllProduct()
	    {
		 ArrayList<Product> p=productDao.getAllProduct();
         return p;
   
	    }
}
