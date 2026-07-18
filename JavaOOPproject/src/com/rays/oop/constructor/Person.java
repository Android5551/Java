package com.rays.oop.constructor;

import java.util.Date;

public class Person {
	/*
	 * name address dob getname string getaddress string getdob date
	 * 
	 */
	private String name;
	private String address;
	private Date dob;

	public Person(String name, String address, Date dob) {

		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}

}
