package com.rays.collection.list.cutomlist.emp;

public class Emp {
	private String name;
	private String company;
	private double salary;
	
	// constructor
	public Emp(String name, String company, double salary) {
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "|name -> " + name + "| company -> " + company + "| salary -> " + salary + "|";
	}
	

}
