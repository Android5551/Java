package com.rays.oop.polymorphism.withreturntype.shape;

public class TestShapeReturnType {

	public static void main(String[] args) {
		// creating array ; 3 memory allocated
		Shape [] s = new Shape[3];
		
		// Assigning objects as method is static
		// we can call it directly using class name
		s[0] = Shape.getShape(1); // new Circle()
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);
		
		// type casting
		Circle c= (Circle) s[0];
		c.setRadius(2);
		
		Rectangle r = (Rectangle) s[1];
		r.setBreadth(12);
		r.setLength(33);
		
		Triangle t = (Triangle) s[2];
		t.setBase(3);
		t.setHeight(10);
		
		for(int i = 0; i < s.length;i++) {
			s[i].area();
		}
	}

}
