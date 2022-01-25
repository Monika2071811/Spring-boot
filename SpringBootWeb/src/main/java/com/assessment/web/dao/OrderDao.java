package com.assessment.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assessment.web.model.Orrder;
import com.assessment.web.repository.OrderRepository;
import com.assessment.web.service.OrderService;

@Repository
public class OrderDao implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Orrder placeOrder(Orrder orrder) {
		// TODO Auto-generated method stub
		Orrder ord=orderRepository.save(orrder);
		return ord;
	}

	@Override
	public int getOrderId(String orderPlacedDate, int productId, int customerId) {
		// TODO Auto-generated method stub
		Orrder ord=(Orrder)orderRepository.findByProductIdAndCustomerId(productId,customerId);
		return ord.getOrderId();
		
	}

}
