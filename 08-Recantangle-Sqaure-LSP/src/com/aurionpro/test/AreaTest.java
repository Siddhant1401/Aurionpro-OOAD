package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Sqaure;

public class AreaTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Is Rectangle a Rectangle : " + isRectangle(rectangle));
		System.out.println("Area of Rectangle : " + rectangle.getHeight() * rectangle.getWidth());
		System.out.println("---------------------------------------------------------------------------");
		Sqaure sqaure = new Sqaure(10);
		System.out.println("Is Sqaure a Rectangle : " + isRectangle(sqaure));
		System.out.println("Area of Sqaure : " + sqaure.getHeight() * 4);
	}

	public static boolean isRectangle(Rectangle rectangle) {

		//System.out.println("Height : " + rectangle.getHeight());
		int prev = rectangle.getWidth();

		rectangle.setHeight(100);
		int curr = rectangle.getWidth();
		return prev == curr;
	}
}
