package com.rays.oop.constructor.Automobile;

public class Automobile {
	private String color;
	private int speed;
	private String make; 
	private String model;
	
	public Automobile(String color, int speed, String make, String model) {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
		this.color = color;
		this.speed = speed;
		this.make = make;
		this.model = model;
		
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	
}
