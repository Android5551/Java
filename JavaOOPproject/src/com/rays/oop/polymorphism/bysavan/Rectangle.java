package com.rays.oop.polymorphism.bysavan;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public boolean validate() {
		if (this.length > 0 && this.width > 0) {
			System.out.println("Length and width are given");
			return true;
		} else {
			System.out.println("Length and width aren't given");
			return false;
		}
	}

	@Override
	public void area() {
		int rectangleArea = this.length * this.width;
		System.out.println("Rectangle Area = " + rectangleArea);
	}
}
