package com.otherpackage;

import com.parent.ParentClass;

public class OtherPkgChildClass extends ParentClass{
	
	ParentClass pc = new ParentClass();
	
	public void someOther() {
		prostr = "Parent";
		proint = 10;
//		defname = "Default";
//		defint = 10;
		
		//parent protected method
		printpro();
		
		//parent default method
//		printdef();
	}

	//default members are not accessible in child class
}
