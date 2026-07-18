package com.rays.oop.polymorphism.shape;

public class TestShapeCast {

	public static void main(String[] args) {
		Shape s = new Circle();
		Circle c = (Circle) s;
		
		c.setRadius(20);
		c.area();
		
		
		// -----------------------------------
		Shape s1 = new Rectangle();
		Rectangle r = (Rectangle) s1;
		
		r.setLength(2);
		r.setWidth(1);
		
		r.area();
		//----------------------------------
		
		Shape s2 = new Triangle();
		Triangle t = (Triangle) s2;
		
		t.setBase(5);
		t.setHeight(2);
		
		t.area();

	}

}
