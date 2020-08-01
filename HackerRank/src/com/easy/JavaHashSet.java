package com.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set pair = new HashSet<>();
        for(int i=0;i<t;i++) {
        	String join = pair_left[i].concat(pair_right[i]);
        	pair.add(join);
        	System.out.println(pair.size());
        }
        
        
//Write your code here

	}

}
