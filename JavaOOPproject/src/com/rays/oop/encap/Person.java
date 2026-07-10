package com.rays.oop.encap;

import java.util.Date;

public class Person {
		// TODO Create Person class
		/*
		 * Class Properties:
		 * Attributes:
		 * - name: String
		 * - dob: Date
		 * - address: String
		 * + $AVG_AGE
		-------------------------
		 * + getName(): String
		 * + setName()
		 * + getAddress(): String
		 * + setAddress()
		 * + getDob(): Date
		 * + setDob()
		 * + getAge(): int
		 */		
		private String name;
		private Date dob;
		private String address;
		
		// Name
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		// Address ;we are setting address hence no need to return value
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getAddress() {
			return this.address;
		}
		
		// DOB
		public void setDOB(Date dob) {
			this.dob = dob;
		}
		
		public Date getDOB() {
			return this.dob;
		}
		public int getAge() {
			Date now = new Date();
			int age = now.getYear() - this.dob.getYear();
			return age;
		}
		
		
	}


