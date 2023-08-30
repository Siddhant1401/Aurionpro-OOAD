package com.aurionpro.model;

public class RemoteController {

	private DogDoor door;
	
	public RemoteController(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		System.out.println("RemoteController : Pressed the remote button");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
	}
}
