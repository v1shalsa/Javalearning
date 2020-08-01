package com.compare;

import java.util.Comparator;

public class Checker implements Comparator {

	@Override
	public int compare(Object a, Object b) {
		Player p1 = (Player)a;
		Player p2 = (Player)b;
		
		if(p1.score == p2.score)
		{
			return p1.name.compareTo(p2.name);			
		}
		else
			return p1.score-p2.score;
	}	
	
}
