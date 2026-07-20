package com.rays.oop.abstraction.shape;

public class TestShape {

	public static void main(String[] args) {
//		Shape s = new Shape(); -> Shape is abstract class hence no object creation
		System.out.println();
		System.out.println("_________Circle_________");
		System.out.println();
		
		Shape s = new Circle();
		
		Circle c=(Circle) s;
		
//		s.area(); -> 0
		c.setRadius(3);
//		s.area(); -> 28.27
		c.area();
		
		System.out.println();
		System.out.println("_________Rectangle_________");
		System.out.println();
		
		Shape s1 = new Rectangle();
		
		Rectangle r=(Rectangle) s1;
		
		r.setBreadth(3);
		r.setLength(2);

		r.area();
		
		System.out.println();
		System.out.println("_________Triangle_________");
		System.out.println();
		
		Shape s2 = new Triangle();
		
		Triangle t=(Triangle) s2;
		
		t.setBase(4);
		t.setHeight(5);
		
		t.area();

	}

}
