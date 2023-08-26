package com.aurionpro.model;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private List<Order> orderLists;

	public Customer(int id, String name, List<Order> orderLists) {
		super();
		this.id = id;
		this.name = name;
		this.orderLists = orderLists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrderLists() {
		return orderLists;
	}

	public void setOrderLists(List<Order> orderLists) {
		this.orderLists = orderLists;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderLists=" + orderLists + "]";
	}

}
