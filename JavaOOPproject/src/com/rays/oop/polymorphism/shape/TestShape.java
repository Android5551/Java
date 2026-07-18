package com.rays.oop.polymorphism.shape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setRadius(10);
		c.area();

		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(5);

		r.area();

		Triangle t = new Triangle();
		t.setBase(4);
		t.setHeight(5);

		t.area();
	}

}
