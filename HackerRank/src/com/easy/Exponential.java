package com.easy;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int n =5;
		int b = 3;
		int sum = 0;
		for(int ex=0;ex<n;ex++) {
			sum = sum + (int)(b*Math.pow(2, ex));
			System.out.print((sum+a)+" ");
		}
	}

}
