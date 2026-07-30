/**
 * 
 */
package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("PS5", 59000, "Electronic");
		Product p2 = new Product("iPhone 16", 85000, "Mobile");
		Product p3 = new Product("Nike Shoes", 4500, "Footwear");
		

		List<Product> l = new ArrayList<>();
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		l.forEach(System.out::println);
		Collections.sort();
		
		
	
	}

}
