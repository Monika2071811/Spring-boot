package com.assessment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.web.model.Orrder;


public interface OrderRepository extends CrudRepository<Orrder, Integer> {

	public Orrder findByProductIdAndCustomerId(int productId,int customerId);
	public Orrder findByProductId(int productId);
}
