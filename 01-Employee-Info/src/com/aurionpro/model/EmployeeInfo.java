package com.aurionpro.model;

public class EmployeeInfo {

	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double ta;

	public EmployeeInfo(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = this.basicSalary * 20 / 100;
		this.da = this.basicSalary * 15 / 100;
		this.ta = this.basicSalary * 10 / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", hra=" + hra + ", da="
				+ da + ", ta=" + ta + "]";
	}

	public double calculateTotalSalary(EmployeeInfo employee) {
		double monthlySalary =  employee.getBasicSalary() + employee.getHra() +  employee.getDa() + employee.getTa();
		return monthlySalary;

	}
	
	

}
