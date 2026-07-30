package com.rays.collection.list.cutomlist.student;
import java.util.*;
public class TestStudentByIterator {

	public static void main(String[] args) {
		Student s = new Student("Ram",21,"maths");
		Student s1 = new Student("Shyam",22,"phy");
		Student s2 = new Student("Mohan",23,"chm");
		Student s3 = new Student("Krishna",24,"commerce");
		Student s4 = new Student("Damodar",20,"bio");
		Student s5 = new Student("vishnu",25,"eng");
		
		List <Student> l = new ArrayList <>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		// using for each loop
//		for(Student st : l) {
//			System.out.println(st);
//		}
		Iterator<Student> i = l.iterator();
		
		while(i.hasNext()) {
			Student st = i.next();
			System.out.println(st);
		}

	}

}
