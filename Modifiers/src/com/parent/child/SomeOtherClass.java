package com.parent.child;

import com.parent.ParentClass;

public class SomeOtherClass {
	
	ParentClass pc = new ParentClass();

	public void printSome() {
		
		//prostr = "Parent"; //Cannot access protected or default modfiers from the 
							//Class from PArent package. we get compilation error
//		defstr = "Default";
//		printdef();
//		printpro();
	}
}
