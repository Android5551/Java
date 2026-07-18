package com.rays.oop.polymorphism.bank;

public class TestRbiArray {

	public static void main(String[] args) {
		// TODO using array
		// array of parent class
		Rbi [] r = new Rbi [3];
		
		r[0] = new Sbi();
		r[1] = new Icici();
		r[2] = new Axis();
		
		
		for(int j=0;j<r.length;j++) {
			System.out.println(r[j].getName()+" "+r[j].interestRate()+" %");
		}
		

	}

}
