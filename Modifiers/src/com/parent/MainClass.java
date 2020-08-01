package com.parent;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cc = new ChildClass();
		NotChildClass ncc = new NotChildClass();
		
		cc.printParent();
		cc.printpro();
		ncc.printParent();

	}

}
