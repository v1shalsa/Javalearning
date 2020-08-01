package com.easy;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=(-Math.pow(2,31)) && x<=(Math.pow(2,31)-1))
                    System.out.println("* int");
                if(x>=(-Math.pow(2,63)) && x<=(Math.pow(2,63)-1))
                    System.out.println("* long");
                
                System.out.println((long)Math.pow(2,63));
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

	}

