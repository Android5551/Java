package com.rays.oop.polymorphism.withreturntype.shape;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public void area() {
		System.out.println("Area of circle "+Math.PI*radius*radius);
	}
}
