package com.rays.oop.interfaces.ecom;

public class Ecom extends Webapp implements DarkTheme, LightTheme{

	@Override
	public void dark() {
		System.out.println("switch to dark theme");
		
	}
	
	@Override
	public void light() {
		System.out.println("switch to light");
		
	}
	
	
}
