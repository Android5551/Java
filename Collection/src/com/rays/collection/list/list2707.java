package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class list2707 {
	public static void main(String[] args) {
		List <Object> l = new ArrayList<>();
		
		l.add("Apple");
		l.add(1,"Mango");
		l.add(1,"Orange");
		System.out.println(l.get(2));
		l.set(1, "Guava");
		System.out.println(l);
		
		System.out.println(l.subList(0, 2));;
		
	}
	
	
	
	
}
