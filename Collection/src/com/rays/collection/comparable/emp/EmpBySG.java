package com.rays.collection.comparable.emp;

public class EmpBySG implements Comparable<EmpBySG>{
	private String name;
	private String company;
	private double salary;
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void setCompany(String c) {
		this.company = c;
	}
	public String getCompany() {
		return this.company;
	}
	
	public void setSalary(double s) {
		this.salary = s;
	}
	public double getSalary() {
		return this.salary;
	}
	@Override
	public int compareTo(EmpBySG o) {
//		return this.name.compareTo(o.name);
//		return this.company.compareTo(o.company);
		return Double.compare(this.salary, o.salary);
	}

}
