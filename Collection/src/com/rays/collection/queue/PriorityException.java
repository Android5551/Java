package com.rays.collection.queue;

import java.util.PriorityQueue;

public class PriorityException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Object> p = new PriorityQueue<>();
		
		p.add("Hello");
		p.add("world");
		try {
			p.add(true);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(p);
	}

}
