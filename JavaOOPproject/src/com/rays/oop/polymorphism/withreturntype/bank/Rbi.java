package com.rays.oop.polymorphism.withreturntype.bank;

public class Rbi {
	
	public String getName() {
		return "Rbi";
	}
	public double InterestRate() {
		return 10.1;
	}
	public static Rbi getBank(int i) {
		if(i == 1) {
			return new Sbi();
		}
		if(i == 2) {
			return new Icici();
		}
		if(i == 3) {
			return new Axis();
		}
		return new Rbi();
	}
}
