/**
 * 
 */
package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("Rohan");
		l.add("Aman");
		l.add("Karan");
		l.add("Karan");
		l.add("Karan");
		l.add("Vikas");
		l.add("Rahul");
		l.add("Suresh");
		l.add("Ankit");
		l.add("Deepak");
		l.add("Mohit");
		l.add("Rakesh");
		l.add("Rakesh");
		
		//System.out.println(l.stream());  // java.util.stream.ReferencePipeline$Head@6f539caf
		// endsWith is case sensitive
		// filter returns boolean
		// map returns object of type defined in generic
		l.stream().sorted(Comparator.reverseOrder()).distinct().map(e -> e.toUpperCase()).filter(e -> e.endsWith("N")).forEach(System.out::println);
	}

}
