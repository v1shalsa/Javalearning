package com.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map ph = new HashMap<String,Integer>();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			
			ph.put(name, phone);
			
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(ph.containsKey(s))
			{
				System.out.println(s+"="+ph.get(s));
			}
			else
				System.out.println("Not found");
		}
	}

}
