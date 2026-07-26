package com.rays.oop.constructor.calling;

public class Circle extends Shapes{
	private double radius;
	public Circle() {
		System.out.println("this is default constructor of circle");
	}
	public Circle(double radius) {
		super("Red",3);
		this.radius = radius;
		System.out.println(this.radius+" "+borderWidth+" "+color);
	}
}
