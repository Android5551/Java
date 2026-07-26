package com.rays.oop.constructor.calling;

public class Shape {
	protected String color;
	protected int borderWidth;

	public Shape() { //6 
		System.out.println("This is default constructor"); //7
	}
	public Shape(String color) { //4
		this(); //5
		this.color = color;
		System.out.println(this.color); // 8
	}
	public Shape(String color, int borderWidth) { // 2
		this(color); //3
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth); //9
		
	}
	public static void main(String[] args) {
		Shape s  = new Shape("Red",3); //1
		
	}
}


