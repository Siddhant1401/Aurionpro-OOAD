package com.aurionpro.test;

import com.aurionpro.model.BarkRecognizer;
import com.aurionpro.model.Dog;
import com.aurionpro.model.DogDoor;
import com.aurionpro.model.RemoteController;

public class DogTest {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer bark = new BarkRecognizer(door);
		RemoteController remote = new RemoteController(door);
		Dog dog = new Dog();
		
		dog.bark();
		bark.recognize("Woof");
		remote.pressButton();
	}
}
