package com.easy;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new  Scanner(System.in);
		
		String input = in.next();
		
		char[] rev = input.toCharArray();
		
		String palin = "";
		for(int i = rev.length-1;i>=0;i--) {
			palin+=rev[i];
		}
		
		if(input.equalsIgnoreCase(palin)) 
			System.out.println("Yes");
		else 
				System.out.println("No");
			
		
	}

}
