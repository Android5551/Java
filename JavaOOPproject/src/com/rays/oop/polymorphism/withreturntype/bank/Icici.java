package com.rays.oop.polymorphism.withreturntype.bank;

public class Icici extends Rbi{
	@Override
	public String getName() {
		return "Icici";
	}
	
	@Override
	public double InterestRate() {
		return 12.1;
	}
}
