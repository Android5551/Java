package com.rays.oop.exceptions.custom.finaly;

public class arith {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		
		
		try {
			int c = b / a;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program finished");
		}

	}

}
