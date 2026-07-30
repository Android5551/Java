package com.rays.collection.list.cutomlist.student;

public class Student {
	private String name;
	private int rollNo;
	private String subject;
	
	// either create getter setter or
	// create parameterized constructor and to print use getters
	
	public Student() {
		System.out.println("This is default constructor");
	}
	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
		
	}

	@Override
	public String toString() {
		return "name =" + name + " roll no. = "+ rollNo + " subject = "+ subject; 
	} 
		
	
	

}
