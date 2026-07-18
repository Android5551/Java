package com.rays.oop.polymorphism.withreturntype.shape;

public class Triangle extends Shape{
	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("Area of triangle "+0.5*base*height);
	}
}
