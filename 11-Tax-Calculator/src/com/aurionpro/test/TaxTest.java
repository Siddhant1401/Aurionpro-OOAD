package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;

public class TaxTest {

	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator();
		System.out.println(tax.calculateTax(100, 10));
		System.out.println(tax.calculateTax(99, 0));
	}
}
