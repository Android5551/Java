/**
 * 
 */
package com.rays.collection.comparable.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmpByStr {

	public static void main(String[] args) {
		EmpByStr e = new EmpByStr(10000, "Ravi", "TCS");
		EmpByStr e1 = new EmpByStr(9000, "Roshan", "ECS");
		EmpByStr e2 = new EmpByStr(30000, "Ram", "CS");
		
		List<EmpByStr> l = new ArrayList<>();
		
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		l.forEach(System.out::println);
		
		Collections.sort(l);
		
		System.out.println("----------");
		l.forEach(System.out::println);	
		
		
		
	}
	
	

}
