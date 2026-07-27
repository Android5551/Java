package com.rays.oop.exceptions.custom.Account;

public class Account {
	private double balance;
	
	public Account() {
		
	}
	public Account(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InsufficientFundsException();
		}
		else {
			balance  = balance - amount;
			System.out.println(balance);
		}
	}
	
}
