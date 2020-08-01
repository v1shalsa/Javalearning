package com.dynamic;

import java.util.Scanner;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String size;
		String[] nos;
		
		size  = in.nextLine();
		nos = in.nextLine().split(" ");	
		
		int arraysize = Integer.parseInt(size);
		// create a new array
		if(arraysize!=nos.length)
		{
			System.out.println("Number entered are not equal to array size");			
			
		}else {
						
			int[] mainArray = new int[arraysize];
			
			// Add these nos in the array
			for(int i=0;i<arraysize;i++) {
				mainArray[i] = Integer.parseInt(nos[i]);
			}

			// Now lets find the positive and negative arrays
			int negsum = 0;
			for(int i=0;i<arraysize;i++) {
				int sum =0;
				for(int j=i;j<arraysize;j++) {
					for(int k=i;k<=j;k++) {
						//System.out.print(mainArray[k]+",");
						sum+=mainArray[k];
					}
					
					if(sum<0)
					{
						negsum++;
					}
					sum =0;
					
				}			
			}
			System.out.println(negsum);
			
		}
				
		in.close();
	}

}
