/**
 * 
 */
package com.rays.collection.comparable.marksheet;

public class MarksheettoString implements Comparable<MarksheettoString> {
	private int rollNo;
	private String name;
	private int phy;

	public MarksheettoString(int r, String n, int p) {
		this.rollNo = r;
		this.name = n;
		this.phy = p;
	}

	@Override
	public String toString() {
		return "roll No. -> " + rollNo + " name -> " + name + " phy -> " + phy;
	}

	@Override
	public int compareTo(MarksheettoString o) {
		System.out.println(this.name + " vs " + o.name);
		return this.name.compareTo(o.name);
	}

}
