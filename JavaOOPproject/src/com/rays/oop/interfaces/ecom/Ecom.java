package com.rays.oop.interfaces.ecom;

public class Ecom extends Webapp implements DarkTheme, LightTheme{

	@Override
	public void Dark() {
		System.out.println("swithch to dark");
		
	}
	
	@Override
	public void Light() {
		System.out.println("swithch to light");
		
	}
	
	
}
