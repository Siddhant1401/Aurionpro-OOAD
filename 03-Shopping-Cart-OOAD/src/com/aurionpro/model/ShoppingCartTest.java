package com.aurionpro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Bat", 100, 10);
		Product p2 = new Product(2, "Ball", 200, 20);
		Product p3 = new Product(3, "Kite", 300, 13);
		Product p4 = new Product(4, "Doll", 400, 30);
		Product p5 = new Product(5, "Car", 500, 50);
		Product p6 = new Product(6, "Kitchen Set", 900, 70);
		Product p7 = new Product(7, "Fan", 600, 60);

		LineItem l1 = new LineItem(101, 2, p1);
		LineItem l2 = new LineItem(102, 5, p2);
		LineItem l3 = new LineItem(103, 7, p3);
		LineItem l4 = new LineItem(104, 1, p7);
		LineItem l5 = new LineItem(105, 4, p4);

		Order order1 = new Order(201, LocalDate.parse("2023-08-26", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				Arrays.asList(l1, l2, l3));
		
		Order order2 = new Order(202, LocalDate.parse("2023-08-26", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				Arrays.asList(l4, l5, l3));
		
		Order order3 = new Order(203, LocalDate.parse("2023-08-29", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				Arrays.asList(l4, l1, l5));

		Customer c1 = new Customer(301, "Ram", Arrays.asList(order1,order2));
		System.out.println("Customer Details : \n ID : "+c1.getId()+"\n Name : "+c1.getName());
		for (Order order : c1.getOrderLists()) {
			System.out.println(order);
			System.out.println("--------------------------------------");
			for (LineItem lineItem : order.getItems()) {
				System.out.println(lineItem);
				System.out.println(lineItem.getProduct());
				
			}
			System.out.println("Order Price : " +order.getOrderPrice());
			System.out.println("*********************************************************");
		}
	
	}
}
