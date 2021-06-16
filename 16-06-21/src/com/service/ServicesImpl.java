package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Order;

public class ServicesImpl implements Services {
	private List<Order> list= null;
	{
		list=new ArrayList<Order>();
	}
	@Override
	public Order createOrder(Order order) {
		list.add(order);
		return order;
	}

	@Override
	public List<Order> getAllOrder() {
		
		return list;
	}

}
