package com.rays.oop.constructor.calling;
// to use only one attribute
public class Shape1 {
	
		protected String color;
		protected int borderWidth;

		public Shape1() { //6 
			System.out.println("This is default constructor"); //7
		}
		public Shape1(String color) { //4
//			this(); //5
			this.color = color;
			System.out.println(this.color); // 8
		}
//		public Shape1(String color, int borderWidth) { // 2
//			this(color); //3
//			this.borderWidth = borderWidth;
//			System.out.println(this.borderWidth); //9
//			
//		}
		public static void main(String[] args) {
			Shape1 s  = new Shape1("Red"); //1
			
		}
	}




