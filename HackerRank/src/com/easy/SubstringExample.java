package com.easy;

import java.util.Scanner;

public class SubstringExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		int size = in.nextInt();
		
		String[] subs = new String[str.length()-(size-1)];
				
		for(int i =0,j=size;i<=str.length()-size;i++,j++) {
			subs[i] = str.substring(i, j);			
		}
				
		for(int i=0;i<subs.length;i++) {
			for( int j=1;j<subs.length;j++){				
				for(int pos = i;pos<j;pos++) {
					int flag= subs[pos].compareTo(subs[j]);
					if(flag<0) {
						String temp=subs[j];
						subs[j]=subs[pos];
						subs[pos] = temp;					
					}
				}
				
			}
						
		}
		
			System.out.println(subs[subs.length-1]);
			System.out.println(subs[0]);
		
	}

}
