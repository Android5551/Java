package com.rays.oop.exceptions.custom.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account(4500);
		
		a.withdraw(1000);
	}
}
