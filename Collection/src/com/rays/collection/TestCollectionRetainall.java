package com.rays.collection;

import java.util.*;

// original collection is modified? if yes true else false
public class TestCollectionRetainall {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<>();
		
		c.add("this is string");
		c.add('C');
		c.add(45); 
		
		Collection c2 = new ArrayList();
		c2.add(45);
		c2.add("string");
		
//		c.retainAll(c);
		
		System.out.println(c.retainAll(c2));
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c.contains(45));
		System.out.println(c2.containsAll(c)); // wherever All is there it needs more than one collection
		c.addAll(c2);
		System.out.println(c);
	}
}
