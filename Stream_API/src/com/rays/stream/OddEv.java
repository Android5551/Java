package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OddEv {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=10;i++) {
			list.add(i);
		}
		
		list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
	}
}