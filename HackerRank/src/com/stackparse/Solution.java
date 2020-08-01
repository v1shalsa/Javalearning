package com.stackparse;

import java.util.Scanner;

class Parser{
	
	boolean isBalanced(String s) {
		
		int open = -1;
		int close = -1;
		boolean flag = false;
		
		char[]strStack = s.toCharArray();
		
		if(strStack[0]=='}'||strStack[0]==')')
			return flag;
		
		for(int i=0;i<s.length();i++) {
			if(strStack[i]=='('||strStack[i]=='{')
				open++;
			else
			{
				close++;
			}
						
		}
		
		if(open==close) flag= true;
		else return flag;
		
		for(int i=0;i<s.length();i++) {
			
			if(i+1<s.length()) {
				if((strStack[i]=='{' && strStack[i+1]==')')
						||(strStack[i]=='{' && strStack[i+1]==')')) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}
}



public class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}

}
