package com.rays.oop.polymorphism.bysavan;

public class Shape {
	public void execute() {
		if (validate()) {
			area();
		} else {
			System.out.println("invalid parameters");
		}
	}

	public boolean validate() {
		return false;
	}

	public void area() {
		System.out.println("Shape Area Method");
	}
}
