/**
 * 
 */
package com.rays.collection.comparable.marksheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarktoStr {

	public static void main(String[] args) {
		MarksheettoString m = new MarksheettoString(21, "Krish", 38);
		MarksheettoString m1 = new MarksheettoString(19, "Rakesh", 58);
		MarksheettoString m2 = new MarksheettoString(17, "Ramesh", 68);
		
		List <MarksheettoString>l = new ArrayList<>();
		
		l.add(m);
		l.add(m1);
		l.add(m2);
		
		l.forEach(System.out::println);
		Collections.sort(l);
		System.out.println("---------");
		l.forEach(System.out::println);
		
	}

}
