package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteration {
	// .hasNext() -> boolean
	// .next() -> Object
	// .remove() -> void
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Mango");
		l.add("Orange");
		l.add("Apple");
		l.add("Banana");
		l.add("Watermelon");
		l.add("Chiku");
		Iterator i = l.iterator(); // Iterator interface
		
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
			i.remove();
		}
		System.out.println(l);
		/*
		 * l is an ArrayList.
		 * The iterator() method of ArrayList creates and returns an object of some class that implements Iterator.
		 * That returned object's reference is stored in i.
		 * */
		

	}

}
