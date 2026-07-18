package com.rays.oop.polymorphism.bank;

public class TestRbiMethodArgs {
	public static void main(String[] args) {
		// TODO using array
		// array of parent class
		Rbi[] r = new Rbi[3];

		r[0] = new Sbi();
		r[1] = new Icici();
		r[2] = new Axis();

		LoanEnquiry(r);

	}

	static void LoanEnquiry(Rbi[] r) {
		for (Rbi b : r) {
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " " + rate);
		}
	}
}