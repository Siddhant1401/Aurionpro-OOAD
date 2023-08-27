package com.aurionpro.test;

import javax.print.attribute.standard.PrinterInfo;

import com.aurionpro.model.DiwaliInterest;
import com.aurionpro.model.FixedDeposite;
import com.aurionpro.model.HoliInterest;

public class FestivalTest {

	public static void main(String[] args) {

		FixedDeposite fd1 = new FixedDeposite("Ram", 10000, 2, new DiwaliInterest());
		FixedDeposite fd2 = new FixedDeposite("Sita", 10000, 2, new HoliInterest());
		
		printInfo(fd1);
		printInfo(fd2);
		

		
	}

	public static void printInfo(FixedDeposite fd) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Name : "+fd.getName()+"\n Principal Amount : "+fd.getPrincipal()+"\n Duration : "+fd.getDuration()+"\n Festival Name : "+fd.getInterest().getName()+"\n Simple Interest : "+fd.calculateSimpleInterest());
	}
}
