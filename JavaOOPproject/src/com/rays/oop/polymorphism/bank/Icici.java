package com.rays.oop.polymorphism.bank;

public class Icici extends Rbi{
	@Override
	public String getName() {
		return "Icici";
	}
	@Override
	public double interestRate() {
		return 9.8;
	}
}
