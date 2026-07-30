package com.rays.collection.list.cutomlist.marksheet;
import java.util.*;

public class TestMarksheetIter {

	public static void main(String[] args) {
		Marksheet e1 = new Marksheet("Ram",1,50,60,56);
		Marksheet e2 = new Marksheet("Shyam",2,67,76,77);
		Marksheet e3 = new Marksheet("Mohan",3,89,78,98);
		Marksheet e4 = new Marksheet("Krish",4, 88, 99, 45);
		
		
		List<Marksheet> l = new ArrayList<>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		Iterator<Marksheet> i = l.iterator();
		
		while(i.hasNext()) {
			Marksheet e = i.next();
			System.out.println(e);
		}
	
		
		

	}

}
