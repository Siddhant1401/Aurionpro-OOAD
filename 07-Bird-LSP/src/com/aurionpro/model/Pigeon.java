package com.aurionpro.model;

public class Pigeon implements IFlyable {

	public String name;

	public Pigeon(String name) {
		super();
		this.name = name;
	}

	@Override
	public void bodyColor() {
		System.out.println(name + " has blue body color");
	}

	@Override
	public void fly() {
		System.out.println(name + " is flying");
	}

}
