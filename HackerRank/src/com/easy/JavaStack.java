package com.easy;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List mystack = new Stack<>();

		Scanner in = new Scanner(System.in);
		String line = in.next();
		char[]brackets = line.toCharArray();
		int index = -1;
		boolean flag = true;
		for(char ch:brackets) {
			if(ch=='{'||ch =='('||ch=='[')
			{
				mystack.add(ch);
				index++;
			}			
			else
				try {
					mystack.remove(index);
					index--;
				}catch(IndexOutOfBoundsException ee) {
					flag = false;
					break;
				}				
		}		
		
		if(index>=0)flag=false;
		System.out.println(flag);
	}

}
