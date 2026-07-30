package com.rays.collection.comparable.marksheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetSetGet {

	public static void main(String[] args) {
		// TODO TestMarksheet: Program
		MarksheetSetrGetr m = new MarksheetSetrGetr();
		m.setName("Ravi");
		m.setRollNo(1);
		m.setPhy(49);
		
		
//		System.out.println("Name ->"+m.getName());
//		System.out.println("Roll ->"+m.getRollNo());
//		System.out.println("Phy ->"+m.getPhy());
		
		MarksheetSetrGetr m1 = new MarksheetSetrGetr();
		m1.setName("Shankar");
		m1.setRollNo(4);
		m1.setPhy(59);
		
		
//		System.out.println("Name ->"+m1.getName());
//		System.out.println("Roll ->"+m1.getRollNo());
//		System.out.println("Phy ->"+m1.getPhy());
		
		MarksheetSetrGetr m2 = new MarksheetSetrGetr();
		m2.setName("Rahul");
		m2.setRollNo(2);
		m2.setPhy(39);
		
		
//		System.out.println("Name ->"+m2.getName());
//		System.out.println("Roll ->"+m2.getRollNo());
//		System.out.println("Physics ->"+m2.getPhy());
		
		List<MarksheetSetrGetr> l = new ArrayList<>();
		l.add(m);
		l.add(m1);
		l.add(m2);
		
		Iterator<MarksheetSetrGetr> i =l.iterator();
		
		while(i.hasNext()) {
			MarksheetSetrGetr o = i.next();
			System.out.println("Name ->"+o.getName()+" Roll ->"+o.getRollNo()+" Phy ->"+o.getPhy());
		}
		
		Collections.sort(l);
		System.out.println("------------");
		Iterator<MarksheetSetrGetr> j =l.iterator();
		while(j.hasNext()) {
			MarksheetSetrGetr o = j.next();
			System.out.println("Name ->"+o.getName()+" Roll ->"+o.getRollNo()+" Phy ->"+o.getPhy());
		}
		
		
		

	}

}
