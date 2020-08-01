package com.hourglass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HourGlass {

	 // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	
    	int[][]temp = new int[3][3];
    	int max = 0;
    	int[]sums = new int[16];    	
    	int index = 0;
    	for(int i =0;i<4;i++) {
    		for(int j =0;j<4;j++) {
    			int sum =0;
    			for(int k=i,q=0;k<i+3 ||q<3;k++,q++) {
    				for(int l=j,r=0;l<j+3 || r<3;l++,r++) {    					
    					if(!((q==1&&r==0) ||(q==1&&r==2))) {
    						temp[q][r]=arr[k][l];
    						System.out.print(temp[q][r]);
    						sum+=temp[q][r];
    					}    						
    					else
    						System.out.print(" ");
    				} 
    				System.out.println();
    			}
    			System.out.println("----Sum = "+sum);
    			sums[index++] = sum;
    		}
    	}
    	
    	Arrays.sort(sums);
    	System.out.println("Maximun sum is := "+sums[sums.length-1]);
    	return max;
            
    }

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	   // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        //bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();

	}

}
