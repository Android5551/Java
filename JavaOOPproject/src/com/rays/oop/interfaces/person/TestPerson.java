package com.rays.oop.interfaces.person;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Student();
		
		p.setAddress("Indore");
		p.setName("Prakash");
		
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		
		Math m = new Student();
		m.Chemistry();
		m.Physics();
		m.Maths();
		
		Bio b = new Student();
		b.biology();
		b.chemistry();
		b.physics();
		
		
	}
}
