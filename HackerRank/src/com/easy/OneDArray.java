package com.easy;

import java.util.Scanner;

public class OneDArray {

	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
		
		/*if(leap>game.length)
			return false;*/
		
		int sum =0;		
		for(int i=0;i<game.length;i++) {
			sum+=game[i];			
		}
		if(sum==0)
			return true;
		
		int index = 0;		
		int i= 0;
		
		boolean flag = true;
				
		
		while(index<game.length)
		{
		//lets walk			
			if(index+1<game.length && game[index+1]>0) 
			{
				flag = false;
				if(((index+leap)<game.length) && game[index+leap]>0 ) 
				{
					flag = false;
					int temp = index+leap;
					temp++;
					if(temp>=game.length) {
						flag = true;
						break;
					}											
				}
				else 
				{
					index += leap;
					flag = true;
				}				
			}
			else 
			{
				flag = true;
				index++;
			}
			if(flag)
				continue;
			else
				break;
		}
											
		return flag;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	}

}
