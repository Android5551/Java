/**
 * 
 */
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferReader {

	public static void main(String[] args) {
		BufferedReader b = null;
		FileReader f = null;
		
		try {
			b = new BufferedReader(new FileReader("C://Users//Piyush//Documents//CODING//Java-workspace//Java//IO//text_files//readfromhere.txt"));
			String l = b.readLine(); // l -> line
			while(l!=null) {
				System.out.println(l);
				l = b.readLine();
			}
			b.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
