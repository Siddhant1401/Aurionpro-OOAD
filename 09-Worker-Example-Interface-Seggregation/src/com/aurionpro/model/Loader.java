package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("Loader has start working");
	}

	@Override
	public void stop() {
		System.out.println("Loader has stop working");
	}

	@Override
	public void eat() {
		System.out.println("Loader is eating");
	}

	@Override
	public void rest() {
		System.out.println("Loader is resting");
	}

}
