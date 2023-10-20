package com.aurionpro.model;

public class TaxCalculator {

	DBLogger logger;

	public TaxCalculator() {

	}

	public DBLogger getLogger() {
		return logger;
	}

	public void setLogger(DBLogger logger) {
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount / rate;
			int m = 10 / 0;
		} catch (ArithmeticException error) {
			new DBLogger().log("Divide By Zer");
		}
		return tax;
	}
}
