package com.rays.oop.polymorphism.shape;

public class TestShapeArray {

	public static void main(String[] args) {
		// TODO using array
		Shape [] s = new Shape[3];
		// 0 1 2
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		// type casting
		Circle c = (Circle) s[0];
		c.setRadius(12);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(4);
		r.setWidth(2);
		
		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(2);
		
		// for loop
		for(int i =0 ; i< s.length;i++) {
			s[i].area();
		}
		

	}

}
