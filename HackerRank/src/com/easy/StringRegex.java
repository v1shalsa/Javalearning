package com.easy;

import java.util.Scanner;

public class StringRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        
	        String replacer = s.replaceAll("[^a-zA-Z]", "#");  	       
	        
	        String[] splitter = replacer.split("#"); 	        
	        
	        int count = 0;
	        for(String x:splitter) {
	        	if(!x.equals(""))
	        		count++;
	        }

	        System.out.println(count);
	        
	        for(String x:splitter) {
	        	if(!x.equals(""))
	        		System.out.println(x);
	        }
	       
	        
	        scan.close();
	}

}
