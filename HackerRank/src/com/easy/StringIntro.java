package com.easy;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareToIgnoreCase(B)>0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
       String start = A.substring(0, 1);
              
       System.out.print(start.toUpperCase().concat(A.substring(1)));
       System.out.print(" ");
       start = B.substring(0, 1);
       System.out.print(start.toUpperCase().concat(B.substring(1)));
	}

}
