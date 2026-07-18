package com.rays.oop.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		
		Date dob = s.parse("01-01-2000"); // converts string to date
		Person p = new Person("Ram","Indore",dob);
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(s.format(p.getDob()));
		
		
		

	}

}
