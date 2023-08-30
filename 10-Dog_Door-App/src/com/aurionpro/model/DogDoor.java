package com.aurionpro.model;

public class DogDoor {

	private boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	
	public void open() {
		System.out.println("The Dog door is open");
		open = true;
	}
	
	public void close() {
		System.out.println("The Dog door is closed");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
}
