package com.rays.collection.list.cutomlist.emp;
import java.util.*;

public class TestEmpIter {

	public static void main(String[] args) {
		Emp e1 = new Emp("Ram","TCS",30000);
		Emp e2 = new Emp("Shyam","Capegemini",60000);
		Emp e3 = new Emp("Mohan","Syntel",70000);
		Emp e4 = new Emp("Krish","MindTree",90000);
		
		List<Emp> l = new ArrayList<>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		Iterator<Emp> i = l.iterator();
		
		while(i.hasNext()) {
			Emp e = i.next();
			System.out.println(e);
		}
	
		
		

	}

}
