package com.rays.collection.enume;

import java.util.Enumeration;
import java.util.Vector;

public class Testenum {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Mango");
		v.add("Orange");
		v.add("Apple");
		v.add("Banana");
		v.add("Watermelon");
		v.add("Chiku");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
		
		
	}

}
