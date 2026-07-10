package com.rays.oop.encap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		// TODO creating object of Person class and Date

		SimpleDateFormat s = new SimpleDateFormat("dd-MMMM-yyyy");
		
		
		Person p = new Person();
		Person p1 = new Person();
		
		//Name
		p.setName("Ram");
		System.out.println("Person's Name is "+p.getName());
		
		//Address
		p.setAddress("Indore");
		System.out.println("Person's Address is "+p.getAddress());
		
		//DOB
		p.setDOB(s.parse("09-July-2001")); //  converts string to date
//		Date's default toString() method prints it in Java's default format.
		System.out.println("Person's date of birth is "+s.format(p.getDOB())); // converts 
		// date to formatted date
		System.out.println("Person's age is "+p.getAge());
		
		// 2nd person
		p1.setName("Shyam");
		p1.setAddress("Ujjain");
		p1.setDOB(s.parse("20-jun-2002")); //converts string to date
		
		
		
		
		
		

	}

}
