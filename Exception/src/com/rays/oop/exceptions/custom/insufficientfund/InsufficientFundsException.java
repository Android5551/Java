package com.rays.oop.exceptions.custom.insufficientfund;

public class InsufficientFundsException extends RuntimeException {
	
	public InsufficientFundsException() {
		super("Insufficient Funds!");
	}
}
