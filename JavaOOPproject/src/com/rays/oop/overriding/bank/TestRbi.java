package com.rays.oop.overriding.bank;

public class TestRbi {

	public static void main(String[] args) {
		System.out.println("---axis bank---");
		Axis a = new Axis();

		a.setInterestRateAxis(11.1);
		System.out.println("Interest rate of Axis bank : " + a.getInterestRate() + "%");

		System.out.println();

		System.out.println("---icici bank---");

		Icici i = new Icici();

		i.setInterestRateIcici(9.8);
		System.out.println("Interest rate of Icici bank :" + i.getInterestRate() + "%");

		System.out.println();

		System.out.println("---sbi bank---");

		Sbi s = new Sbi();

		System.out.println("Interest rate of Sbi bank : " + s.getInterestRate() + "%");

	}

}
