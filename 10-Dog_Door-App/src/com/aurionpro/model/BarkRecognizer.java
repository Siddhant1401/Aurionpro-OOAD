package com.aurionpro.model;

public class BarkRecognizer {

	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	public void recognize(String barkSound) {
		System.out.println("BarkRecognizer : Heard a bark.");
		if (barkSound.equals("Woof")) {
			door.open();
		} else {
			System.out.println("BarkRecognizer : Unrecognized bark");
		}
	}
}
