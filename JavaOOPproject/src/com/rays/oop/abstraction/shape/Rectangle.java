package com.rays.oop.abstraction.shape;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public void area() {
		System.out.println("Area of Rectangle: "+length * breadth);	
	}
	
	
}
