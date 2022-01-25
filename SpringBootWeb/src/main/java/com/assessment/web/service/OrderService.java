package com.assessment.web.service;

import org.springframework.stereotype.Service;

import com.assessment.web.model.Orrder;


@Service
public interface OrderService {
	
	public Orrder placeOrder(Orrder orrder);
	public int  getOrderId(String orderPlacedDate,int productId,int customerId );
}
