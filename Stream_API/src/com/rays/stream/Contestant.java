package com.rays.stream;

public class Contestant {
	private String phoneNo;
	private String name;
	
	public Contestant(String p, String n){
		this.name = n;
		this.phoneNo = p;
		
	}

//	@Override
//	public String toString() {
//		return "Contestant [phoneNo=" + phoneNo + ", name=" + name + "]";
//	}
	
	  public String getPhoneNo() {
	        return phoneNo;
	    }

	    public String getName() {
	        return name;
	    }
	
	
}
