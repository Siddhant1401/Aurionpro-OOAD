package com.aurionpro.model;

public class Sparrow implements IFlyable {

	public String name;

	public Sparrow(String name) {
		super();
		this.name = name;
	}

	@Override
	public void bodyColor() {
		System.out.println(name + " has brownish black body color");
	}

	@Override
	public void fly() {
		System.out.println(name + " is flying");
	}

}
