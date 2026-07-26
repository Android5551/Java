package com.rays.collection.list;

import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {

		List<Object> l = new ArrayList<>();

		l.add(1);
		l.add(1);

		l.add('h');
		l.add('e');
		l.add('l');
		l.add('l');
		l.add('o');

		System.out.println(l);
		List<Object> new_list = new ArrayList<>();

		for (Object o : l) {
			if (!new_list.contains(o)) { // does new list 
				new_list.add(o);
			}

		}

		System.out.println(new_list);
	}

}
