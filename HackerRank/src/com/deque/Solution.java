package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
        }
        System.out.println(deque);
        
        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next().intValue());
        }
	}

}
