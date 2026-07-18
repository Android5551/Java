package com.rays.oop.polymorphism.bank;

public class Axis extends Rbi{
	@Override
	public String getName() {
		return "Axis";
		
	}
	
	@Override
	public double interestRate() {
		return 11.1;
	}
}
