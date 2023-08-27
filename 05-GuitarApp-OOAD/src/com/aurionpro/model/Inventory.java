package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	List<Guitar> guitars = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar newGuitar = new Guitar(serialNumber, price, spec);
		guitars.add(newGuitar);
	}

	public List<Guitar> getInventory() {
		return guitars;
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> searchGuitar(GuitarSpec spec) {
		List<Guitar> searchResults = new ArrayList<Guitar>();
		for (Guitar guitar : searchResults) {
			if (spec.matches(guitar.getSpecs())) {
				searchResults.add(guitar);
			}
		}
		return searchResults;
	}
}
