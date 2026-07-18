package com.rays.oop.polymorphism.withreturntype.bank;

public class TestBank {

	public static void main(String[] args) {
		Rbi [] r = new Rbi[3];
		
		r[0] = Rbi.getBank(1);
		r[1] = Rbi.getBank(2);
		r[2] = Rbi.getBank(3);
		
//		// type casting
//		Sbi s =(Sbi) r[0];
//		Icici i = (Icici) r[1];
//		Axis a = (Axis) r[2];
		
		for (int i=0;i<r.length;i++) {
			// as we are returning so need to use syso
			System.out.println(r[i].getName()+" "+r[i].InterestRate());
		}
		
		

	}

}
