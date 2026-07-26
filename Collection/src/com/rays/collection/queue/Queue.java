package com.rays.collection.queue;

import java.util.ArrayDeque;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Object> q = new ArrayDeque<>();
		q.add("First");
		System.out.println(q);
		q.add("Second");
		System.out.println(q);
		System.out.println("---");
		System.out.println(q.element());
		System.out.println(q); // does not remove head
		System.out.println("---------------");
		q.remove();
		System.out.println(q);
		q.peek();
		System.out.println(q);
		
		q.offer("hello");
		System.out.println(q);
		
		q.add("rocket");
		System.out.println(q);
		
		
	}

}
