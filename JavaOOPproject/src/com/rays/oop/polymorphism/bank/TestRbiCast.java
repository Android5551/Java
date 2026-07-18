package com.rays.oop.polymorphism.bank;

public class TestRbiCast {

	public static void main(String[] args) {
		Rbi r = new Sbi();
		
		//type cast
		Sbi s = (Sbi) r;
		
		System.out.println(s.interestRate());
		System.out.println(s.getName());
		
		// --------------------------------
		
		Rbi r1 = new Icici();
		
		// type cast
		Icici i = (Icici) r1;
		System.out.println(i.interestRate());
		System.out.println(i.getName());
		
		// ---------------------------------
		
		Rbi r2 = new Axis();
		
		Axis a = (Axis) r2;
		System.out.println(a.interestRate());
		System.out.println(a.getName());
	}

}
