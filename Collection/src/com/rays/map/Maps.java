package com.rays.map;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		
		m.put(1,2);
		m.put('S', 'R');
		m.put("see", "rust");
		
		System.out.println(m.get(1));
		
		System.out.println(m.containsKey('S'));
		System.out.println(m.containsValue('R'));
		System.out.println(m.entrySet());
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.remove(1));
		System.out.println(m.size());
		System.out.println(m.values());
		
		
		
	}

}
