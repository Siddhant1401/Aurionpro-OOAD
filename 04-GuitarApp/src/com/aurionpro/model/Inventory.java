package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	List<Guitar> guitarList = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, String builder, String model, String type, String backWood,
			String topWood, double price) {

		Guitar newGuitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		guitarList.add(newGuitar);
	}

	public List<Guitar> getInventory() {
		return guitarList;
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitarList) {
			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> searchGuitar(Guitar searchGuitar) {
		List<Guitar> searchResults = new ArrayList<Guitar>();
		for (Guitar guitar : guitarList) {
			if (guitar.getType().equalsIgnoreCase(guitar.getType())
					&& guitar.getTopWood().equalsIgnoreCase(guitar.getTopWood())
					&& guitar.getModel().equalsIgnoreCase(guitar.getModel())
					&& guitar.getBuilder().equalsIgnoreCase(guitar.getBuilder())
					&& guitar.getBackWood().equalsIgnoreCase(guitar.getBackWood())) {
				searchResults.add(guitar);
			}
		}
		return searchResults;
	}
}
