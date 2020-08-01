package com.easy;

import java.util.Scanner;

public class GeneralArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] oned = new int[size];
		for (int i =0;i<size;i++) {
			int val = in.nextInt();
			oned[i]=val;
		}
		for(int i=0;i<size;i++) {
			System.out.println(oned[i]);
		}
	}

}
