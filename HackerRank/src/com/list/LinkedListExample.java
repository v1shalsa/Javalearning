package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String size = in.nextLine();
		String[] collect = in.nextLine().split(" ");		
		
		List<Integer> listq = new LinkedList<>();
		for(String s:collect) {
			listq.add(Integer.parseInt(s));
		}
		
		String qin = in.nextLine();
		int qs = Integer.parseInt(qin);
		
		for (int i=0;i<qs;i++) {
			String op = in.nextLine();
			if(op.equals("Insert"))
			{
				String[] input = in.nextLine().split(" ");
				int pos = Integer.parseInt(input[0]);
				int val = Integer.parseInt(input[1]);
				listq.add(pos, val);
			}else {
				String input = in.nextLine();
				int index = Integer.parseInt(input);
				listq.remove(index);
			}
		}
		
		Iterator itr = listq.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
	}

}
