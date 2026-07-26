package com.rays.oop.constructor.calling;

public class Shapes {
	protected String color;
	protected int borderWidth;

	public Shapes() { //6 
		System.out.println("This is default constructor"); //7
	}
	
	public Shapes(String color, int borderWidth) { // 2
		this.color = color;
		this.borderWidth = borderWidth;
		
	}
	
}


