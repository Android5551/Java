package com.rays.oop.exceptions.custom.login;

public class login {

	public static void main(String[] args) {
		String name = "admin123";
		
		if(name.equals("admin")){
			System.out.println("user found!");
		}
			else {
				throw new LoginException();
			}
			
		}

	}


