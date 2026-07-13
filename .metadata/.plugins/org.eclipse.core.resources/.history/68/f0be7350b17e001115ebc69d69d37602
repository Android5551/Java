package com.rays.oop.overriding.bank;

public class TestRbi1 {

	public static void main(String[] args) {

		Rbi r1 = new Axis();

		// type casting parent to child
		Axis a = (Axis) r1;

		a.setInterestRateAxis(11.1);
		System.out.println("Interest rate of Axis bank : " + a.getInterestRateAxis() + "%");

		Rbi r2 = new Icici();

		// type casting parent to child
		Icici i = (Icici) r2;

		i.setInterestRateIcici(9.8);
		System.out.println("Interest rate of Icici bank :" + i.getInterestRateIcici() + "%");

		Rbi r3 = new Sbi();

		// type casting parent to child
		Sbi s = (Sbi) r3;

		System.out.println("Interest rate of Sbi bank :" + s.getInterestRate() + "%");

	}

}
