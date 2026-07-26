package com.rays.oop.exceptions.custom.throwss;

public class TestingCheckedPropagations {

	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

	public static void dad() throws Exception {
		mom();
	}

	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		throw new Exception("make a mistake");
	}

}
/*
 * main()
   |
   v
dad()
   |
   v
mom()
   |
   v
son()
   |
   | throw Exception
   X
   ^
   | propagates
mom()
   ^
   | propagates
dad()
   ^
   | propagates
main()
   |
   | catches exception
   v
exception: make a mistake
 * */
 