package com.rays.oop.abstraction.bank;

public class TestRbi {
	public static void main(String[] args) {
		Rbi r = new Sbi();
		
		System.out.println(r.getName());
		System.out.println(r.interestRate()+"%");
		
		Rbi r1 = new Icici();
		
		System.out.println(r1.getName());
		System.out.println(r1.interestRate()+"%");
		
		Rbi r2 = new Axis();
		
		System.out.println(r2.getName());
		System.out.println(r2.interestRate()+"%");
	}
}
