package com.rays.oop.polymorphism.withreturntype.bank;

public class Axis extends Rbi{
	@Override
	public String getName() {
		return "Axis";
	}
	
	@Override
	public double InterestRate() {
		return 11.2;
	}
}

