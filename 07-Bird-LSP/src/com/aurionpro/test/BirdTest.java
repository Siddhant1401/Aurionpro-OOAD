package com.aurionpro.test;

import com.aurionpro.model.IBird;
import com.aurionpro.model.IFlyable;
import com.aurionpro.model.INonFlyable;
import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Pigeon;
import com.aurionpro.model.Sparrow;

public class BirdTest {

	public static void main(String[] args) {

		IBird[] birds = new IBird[] { new Sparrow("Sparrow"), new Pigeon("Pigeon"), new Ostrich("Ostrich") };

		for (IBird iBird : birds) {
			iBird.bodyColor();
			if (iBird instanceof IFlyable) {
				((IFlyable) iBird).fly();
			}
			if (iBird instanceof INonFlyable) {
				((INonFlyable) iBird).walk();
			}
		}
	}
}
