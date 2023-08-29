package com.aurionpro.model;

public class Ostrich implements INonFlyable {

	public String name;

	public Ostrich(String name) {
		super();
		this.name = name;
	}

	@Override
	public void bodyColor() {
		System.out.println(name + " has brown body color");
	}

	@Override
	public void walk() {
		System.out.println(name + " is walking");
	}

}
