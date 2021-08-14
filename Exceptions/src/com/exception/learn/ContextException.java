package com.exception.learn;

public class ContextException extends Exception {
	
	public void exceptionExample(int someVar,int someOtherVar) throws ContextException{
		//Checked Exception learning
		int total = someVar + someOtherVar;
		if(someVar > someOtherVar) throw new ContextException();
		System.out.println("Total = "+someVar+someOtherVar);				
	}

}
