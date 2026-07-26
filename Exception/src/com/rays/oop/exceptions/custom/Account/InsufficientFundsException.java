package com.rays.oop.exceptions.custom.Account;

public class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException() {
		super("Insufficient funds...");
	}
}
