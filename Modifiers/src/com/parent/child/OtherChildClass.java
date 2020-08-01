package com.parent.child;

import com.parent.ParentClass;

public class OtherChildClass extends ParentClass{		
	
	public void printParent() {
		
		prostr = "parent";//protected modifiers are accessible
		proint = 10;		//we don't get compilation error
		//defname = "default"; //default modifiers are not accessible
		//defint = 19;		//we get compilation error	
		printpro();
		//printdef(); //default method is not accessible, we get compilation error
	}

	protected void printpro() {
		System.out.println("Overriden in some other child class");
	}
}
