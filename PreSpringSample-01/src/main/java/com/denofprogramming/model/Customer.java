package com.denofprogramming.model;

import java.util.LinkedList;
import java.util.List;

public class Customer {

	
	private List<Order> orders = new LinkedList<Order>();

	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	public List<Order> getOrders() {
		return new LinkedList<Order>(orders);
	}


	
}
