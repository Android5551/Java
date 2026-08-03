/**
 * 
 */
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputFromKeyb {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("C:\\iofolder\\okk.txt",true));
		System.out.println("start writing your text here...");
		
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(kb);
		String line = in.readLine();
		
		while(!line.equals("exit")) {
			out.println(line); 
			line = in.
		}
	}

}
