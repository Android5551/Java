package com.rays.collection.list;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();

		v.add(1);
		v.add(2);
		v.add("Three");
		v.add(4);
//		Integer i = new Integer(4);
//		v.add(i);
//		Integer value = (Integer) v.get(3);

		System.out.println("Index #3 value ="+v+"  "+v.get(2));

	}

}
