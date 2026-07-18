package com.rays.oop.polymorphism.bank;

public class TestRbi {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println(s.getName());
		System.out.println(s.interestRate());
		
		Icici i = new Icici();
		System.out.println(i.getName());
		System.out.println(i.interestRate());
		
		Axis a = new Axis();
		System.out.println(a.getName());
		System.out.println(a.interestRate());
		
	}
}
