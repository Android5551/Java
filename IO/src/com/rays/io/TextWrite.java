/**
 * 
 */
package com.rays.io;

import java.io.FileWriter;

public class TextWrite {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("C:\\Users\\Piyush\\Documents\\CODING\\Java-workspace\\Java\\IO\\text_files\\writetexthere.txt");
			f.write("I am writing this from eclipse on file");
			// add true if you want to save old data written
			System.out.println("File written successfully");
			f.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
