package com.rays.collection;

import java.util.*;

public class Shuffle {

	public static void main(String[] args) {
		 
		List l = new ArrayList();
		
		l.add("Mango");
		l.add("Orange");
		l.add("Apple");
		l.add("Banana");
		l.add("Watermelon");
		l.add("Chiku");
		
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
				

			}

		
}


