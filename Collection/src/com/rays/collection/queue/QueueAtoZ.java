package com.rays.collection.queue;
import java.util.*;
public class QueueAtoZ {

	public static void main(String[] args) {
		
		ArrayDeque <Object> q = new ArrayDeque<>();
		ArrayDeque <Object> q1 = new ArrayDeque<>();
		
		for(char c = 'a'; c<= 'z';c++) {
			q.add(c);
		}
		System.out.println(q);
		
		while(!q.isEmpty()) {
			q1.add(q.remove());
		}
		System.out.println(q1);
		System.out.println(q);

	}

}
