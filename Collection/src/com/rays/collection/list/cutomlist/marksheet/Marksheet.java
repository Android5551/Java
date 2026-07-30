package com.rays.collection.list.cutomlist.marksheet;

public class Marksheet {
	private int id;
	private int roll;
	private int phy;
	private int chm;
	private int maths;
	private String name;
	
	
	// constructor
	public Marksheet(String name, int roll, int phy, int chm, int maths) {
		this.name = name;
		this.roll = roll;
		this.phy = phy;
		this.chm = chm;
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "|name -> " + name + "| roll -> " + roll + "| phy -> " + phy + "| chm -> "+ chm + "| maths -> "+ maths;
	}
	

}
