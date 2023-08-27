package com.aurionpro.test;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		Inventory i = new Inventory();
		i.addGuitar("101", "build", "Aries", "Guitar", "Alder", "Alder", 20);
		i.addGuitar("102", "build", "A2", "Guitar", "Black Limba", "Black Limba", 60);
		i.addGuitar("103", "build", "DC", "Guitar", "Walnut", "Walnut", 600);
		i.addGuitar("104", "build", "DC", "Guitar", "Walnut", "Walnut", 900);
		i.addGuitar("105", "build", "DC", "Guitar", "Walnut", "Walnut", 200);

		//System.out.println(i.getInventory());

		Guitar g1 = new Guitar("101", "buid", "DC", "Guitar", "Walnut", "Walnut", 0);
		System.out.println(i.searchGuitar(g1));
	}
}
