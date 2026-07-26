package com.rays.collection.list;

import java.util.*;

public class TestCollectionIndex {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<>(); // Can store String, Integer, Boolean, etc.

		list.add("A");
		list.add(3);
		list.add(null);
		list.add(true);
		list.add(3);
		list.add(null);
		
		System.out.println("--------.add(i,object)--------");
		list.add(1, "X");

		System.out.println(list);
		
		System.out.println("--------.get(i)--------");
		System.out.println(list.get(0));

		System.out.println("--------.remove(i)--------");
		System.out.println("Remove "+list.remove(1) +" from "+list);
		
		System.out.println("--------.set(i,o)--------");
		list.set(2,"Red");
		System.out.println("New list "+list);
		
		System.out.println("------------.IndexOf()-----------");
		System.out.println("Index of 3 is "+list.indexOf(3));
		
		System.out.println("---------.set(i,o)---------");
		list.set(2,"Red");
		System.out.println("New list "+list);
		
		System.out.println("--------.LastIndexOf()--------");
		System.out.println("last index of 3 is "+list.lastIndexOf(3));
		
		System.out.println("--------.sublist(start index, last index)--------");
		System.out.println("sublist is "+list.subList(1,3));
		
		System.out.println(list);

	}
}
