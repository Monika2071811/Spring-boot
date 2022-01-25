package com.assessment.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.web.dao.OrderDao;
import com.assessment.web.model.Orrder;


@RestController
public class OrderController {
	
	@Autowired
public OrderDao dao;
	
	@RequestMapping("/placeOrder")
	public Orrder placeOrder(@RequestBody Orrder o)
	{
		Orrder orrder=dao.placeOrder(o);
		return orrder;
	}
	@RequestMapping(value = "/order/v1/submit")
	public int getOrderId(@RequestBody Map<String, String> json) {

		int n = dao.getOrderId(json.get("orderPlacedDate"), Integer.parseInt(json.get("productId")),
				Integer.parseInt(json.get("customerId")));
		return n;
	}

}
