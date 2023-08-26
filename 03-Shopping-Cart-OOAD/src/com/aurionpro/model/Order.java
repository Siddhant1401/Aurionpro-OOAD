package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Order {

	private int id;
	private LocalDate date;
	private List<LineItem> items;
	private double orderPrice;

	public Order(int id, LocalDate date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
		this.orderPrice = calculateOrderPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public double calculateOrderPrice() {
		return items.stream().collect(Collectors.summingDouble(LineItem::getLineItemPrice));
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + ", orderPrice=" + orderPrice + "]";
	}

}
