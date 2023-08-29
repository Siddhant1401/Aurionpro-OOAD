package com.aurionpro.model;

public class Sqaure extends Rectangle {

	public Sqaure(int side) {
		super(side, side);
	}
	
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}

	
}
