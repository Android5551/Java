package com.rays.collection;

import java.util.*;

// original collection is modified? if yes true else false
public class TestCollectionRetainall {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
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
	}
}
