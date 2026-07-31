/**
 * 
 */
package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferedwriter {

	public static void main(String[] args) {
		BufferedWriter b = null;
		FileWriter f = null;
		
		try {
			b = new BufferedWriter(new FileWriter("C:\\Users\\Piyush\\Documents\\CODING\\Java-workspace\\Java\\IO\\text_files\\writetexthere.txt"));
			b.write("Hello");
			b.newLine();
			b.write("World!");
			b.newLine();
			b.write("and beyond!");
			b.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
