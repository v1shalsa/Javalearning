package com.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		ArrayList<ArrayList<Object>> doublearr = new ArrayList<ArrayList<Object>>();
		
		in.nextLine();
		for(int i=0;i<size;i++) {			
			String nostring = in.nextLine();
			String[]nos = nostring.split(" ");
			doublearr.add(new ArrayList());
			for(String s:nos) {
				int no = Integer.parseInt(s);
				doublearr.get(i).add(no);
			}			
		}
		
		int q = in.nextInt();
		in.nextLine();
		for(int i =0;i<q;i++) {
			String query = in.nextLine();
			String[] qnos = query.split(" ");
			int row = Integer.parseInt(qnos[0]);
			int col = Integer.parseInt(qnos[1]);
			try {
				System.out.println(doublearr.get(row).get(col));
			}catch(Exception e) {
				System.out.println("ERROR");
			}
		}
		
		for(int i =0;i<size;i++) {
			for(int j=0;j<doublearr.get(i).size();j++) {
				System.out.print(doublearr.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
