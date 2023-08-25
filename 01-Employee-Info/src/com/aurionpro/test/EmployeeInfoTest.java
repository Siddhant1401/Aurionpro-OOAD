package com.aurionpro.test;

import com.aurionpro.model.EmployeeInfo;

public class EmployeeInfoTest {
	
	public static void main(String[] args) {
		EmployeeInfo employee = new EmployeeInfo(101, "Ram", 50000);
		System.out.println(employee);
		//employee.printSalarySlip();
	}
}
