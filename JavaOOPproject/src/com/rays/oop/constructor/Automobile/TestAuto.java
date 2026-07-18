package com.rays.oop.constructor.Automobile;

public class TestAuto {

	public static void main(String[] args) {
		Automobile a = new Automobile("green",200,"Hyundai","i20");
		
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());
		System.out.println(a.getModel());
	}

}
