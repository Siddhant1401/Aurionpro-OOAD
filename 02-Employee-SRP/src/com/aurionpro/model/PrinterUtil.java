package com.aurionpro.model;

public class PrinterUtil {
	
	public void printSalarySlip(EmployeeInfo employeeInfo) {
		double tax = new TaxUtil().calculateTax(employeeInfo);
		
		System.out.println("Id : "+employeeInfo.getId());
		System.out.println("Name : "+employeeInfo.getName());
		System.out.println("Basic  : "+employeeInfo.getBasicSalary());
		System.out.println("HRA : "+employeeInfo.getHra());
		System.out.println("DA: "+employeeInfo.getDa());
		System.out.println("TA : "+employeeInfo.getTa());
		System.out.println("Total Monthly Salary : "+employeeInfo.calculateTotalSalary());
		System.out.println("Tax : "+tax);
		System.out.println("Net Monthly Salary  :  "+(employeeInfo.calculateTotalSalary()-tax/12));
	}

}
