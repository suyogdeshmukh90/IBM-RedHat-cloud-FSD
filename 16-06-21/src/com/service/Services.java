package com.service;

import java.util.List;

import com.model.Order;

public interface Services {
	public Order createOrder(Order order);
	public List<Order> getAllOrder();

}
