/**
 * 
 */
package com.rays.io;

import java.io.FileReader;

public class TextRead {

	public static void main(String[] args) {
		FileReader f = null;
		try {
		f = new FileReader("C:\\Users\\Piyush\\Documents\\CODING\\Java-workspace\\Java\\IO\\text_files\\readfromhere.txt");
		// provides ascii values of char
		int i = f.read();
		
		while(i != -1) {
			System.out.print((char) i);
			i = f.read();
		}
		f.close();
		
		}catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
	}

}
