package com.easy;

import java.util.Scanner;


public class StaticBlock {

	static Scanner in = new Scanner(System.in);
	static int B = 0;
	static int H = 0;
	static boolean flag = false;
	static {
		B = in.nextInt();
		H = in.nextInt();
		if(B>0&&H>0) 
		{
			flag = true;		
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");	 
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
