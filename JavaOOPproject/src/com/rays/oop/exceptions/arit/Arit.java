package com.rays.oop.exceptions.arit;

public class Arit {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			
			int c = a / b;
		}
		catch(ArithmeticException ar){
			System.out.println(ar.getMessage());
		}
		System.out.println("program finished");
	}
	
}
