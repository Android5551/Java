package com.rays.collection.stack;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		// push() for insert
		// pop() to remove last element
		// peek() to print last element
		Stack<Object> s = new Stack<>();

		Stack<Object> s1 = new Stack<>();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}
//
		System.out.println(s);
//
//
//		for (char c = 'a'; c <= 'z'; c++) {
//
//			s1.push(s.pop());
//
//		}
//		System.out.println(s);
		while (!s.isEmpty()) {
			s1.push(s.pop());
		}
		System.out.println(s1);
		System.out.println(s);
		

		
		
		

	}

}
