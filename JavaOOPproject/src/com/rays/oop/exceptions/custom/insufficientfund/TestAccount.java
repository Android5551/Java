package com.rays.oop.exceptions.custom.insufficientfund;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account(4500.00);
		a.withdraw(10000);
	

	}

}
