package com.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<String> lines = new ArrayList<>();
		try {
			while(in.hasNext()) {
				int i=0;
				int f=1;
				lines.add(in.nextLine());
			}
			
		}catch(Exception ex) {
			int i =0;
			int lineno = 1;
			for(String line:lines) {
				System.out.println(lineno++ +" "+line);
			}
		}
		
	}

}
