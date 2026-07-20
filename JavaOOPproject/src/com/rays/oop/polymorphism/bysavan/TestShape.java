package com.rays.oop.polymorphism.bysavan;

public class TestShape {

	public static void main(String[] args) {
//		Shape s = new Shape();
//		Rectangle r = new Rectangle();
		Shape s1 = new Rectangle();	// prioritizes Rectangle instead of shape
		s1.validate(); // shows shape method validate but at runtime returns child class method
		s1.area();
		
		System.out.println("__________________________");
		System.out.println();
		// to get attributes of Rectangle
		Rectangle r1=(Rectangle) s1;
		
		
		r1.setLength(1);
		r1.setWidth(2);
//		r1.area(); // now it shows Rectangle Method
//		r1.validate();
		r1.execute(); // first it goes to Shape class execute method then validate method of child class 
//		s.area();
//		r.setLength(1);
//		r.setWidth(2);
//		r.
		
//		s1.area();
		System.out.println("___________________________");
		System.out.println();
		s1.execute();
		

	}

}
