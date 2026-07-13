package com.rays.oop.overriding;

public class Circle extends Shape{
	private int radius;
	
	//setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//getter
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public void area() {
		System.out.println("Area of circle");;
	}
}
