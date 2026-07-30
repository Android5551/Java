package com.rays.collection.comparable.marksheet;

public class MarksheetSetrGetr implements Comparable <MarksheetSetrGetr> {
	private int rollNo;
	private String name;
	private int phy;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return this.rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getPhy() {
		return this.phy;
	}
	
	@Override
	public int compareTo(MarksheetSetrGetr o) {
		
		return this.rollNo - o.rollNo; //asc order
	}
	
	
	
	
}
