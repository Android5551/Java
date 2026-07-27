package com.rays.oop.exceptions.arit;

public class Nul {
	
		public static void main(String[] args) {
			String s = null;
			try {
				
				System.out.println(s.toLowerCase());
			}
			catch(Exception ar){
				ar.printStackTrace();
			}
			System.out.println("program finished");
		}
		
	}


