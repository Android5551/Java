/**
 * 
 */
package com.rays.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestContestant {

	public static void main(String[] args) {
		Contestant c1 = new Contestant("9425639955","P");
		Contestant c2 = new Contestant("7897858754","Pi");
		Contestant c3 = new Contestant("6258638899","Pe");
		Contestant c4 = new Contestant("8745612304","Pr");
		Contestant c5 = new Contestant("9425639955","Pa");
		Contestant c6 = new Contestant("4425639955","Pei");
		
		
		Collection.stream();
		List <Contestant> l = new ArrayList <Contestant>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		l.add(c6);
		
		// get ph no.
		l.stream().map(e -> e.getPhoneNo()).forEach(System.out::println);
		System.out.println("-----------");
		
		l.stream().map(x -> x.getPhoneNo()).distinct().forEach(System.out::println);
		System.out.println("-----l------");
		l.stream().map(e -> e.getPhoneNo().startsWith("6").startsWith("7")).forEach(System.out::println);
		System.out.println("-----------");
		
		
	}

}
