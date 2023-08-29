package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("Robot has start working");
	}

	@Override
	public void stop() {
		System.out.println("Robot has stop working");
	}

}
