package com.rays.oop.polymorphism.shape;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle : " + Math.PI * radius * radius);
	}

}
