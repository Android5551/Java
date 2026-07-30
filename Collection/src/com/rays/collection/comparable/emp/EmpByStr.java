/**
 * 
 */
package com.rays.collection.comparable.emp;

public class EmpByStr implements Comparable <EmpByStr>{
	private double salary;
	private String name;
	private String company;
	
	public EmpByStr(double s, String n, String c) {
		this.salary = s;
		this.name = n;
		this.company = c;
	}

	@Override
	public String toString() {
		return "salary=" + salary + ", name=" + name + ", company=" + company;
	}

	@Override
	public int compareTo(EmpByStr o) {
//		return (int) (this.salary - o.salary); // type casting from double to int
//		return this.company.compareTo(o.company);
		return this.name.compareTo(o.name);
	}
	
	

}
