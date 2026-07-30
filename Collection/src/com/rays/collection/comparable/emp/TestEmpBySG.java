/**
 * 
 */
package com.rays.collection.comparable.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmpBySG {

	public static void main(String[] args) {
		EmpBySG e = new EmpBySG();
		
		e.setName("suraj");
		e.setCompany("MindTree");
		e.setSalary(300000.00);
		EmpBySG e1 = new EmpBySG();
		
		e1.setName("neeraj");
		e1.setCompany("L&T");
		e1.setSalary(100000.00);
		EmpBySG e2 = new EmpBySG();
		
		e2.setName("pankaj");
		e2.setCompany("Capegemini");
		e2.setSalary(400000.00);
		
		List<EmpBySG> l = new ArrayList<>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		Iterator<EmpBySG> i=l.iterator();
		// if you write Object o then it can't call child class EmpBySG method getSalary
		// instead of o.getName we can run directly using .toString in EmpBy and run o directly here
		while(i.hasNext()) {
			EmpBySG o = i.next();
			System.out.println(o.getName()+" "+o.getCompany()+" "+o.getSalary());
		}
		
		Collections.sort(l);
		System.out.println("------------");
		Iterator<EmpBySG> j=l.iterator();
		// if you write Object o then it can't call child class EmpBySG method getSalary
		// instead of o.getName we can run directly using .toString in EmpBy and run o directly here
		while(j.hasNext()) {
			EmpBySG o = j.next();
			System.out.println(o.getName()+" "+o.getCompany()+" "+o.getSalary());
		}
	}

}
