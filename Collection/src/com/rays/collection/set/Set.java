package com.rays.collection.set;

import java.util.*;

public class Set {

	public static void main(String[] args) {
		 HashSet s = new HashSet();

	        s.add("A");
	        s.add("B");
	        s.add("A");  // doesn't add this
	        s.add(null);
	        
	        System.out.println(s.contains("A"));

//	        System.out.println(s);

	}

}



       

