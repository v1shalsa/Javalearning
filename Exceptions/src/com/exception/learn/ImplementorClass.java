package com.exception.learn;

public class ImplementorClass {

	ContextException ce = new ContextException();
	
	public void someMethod() {
		try {
			ce.exceptionExample(42, 10);
		}catch (ContextException ee) {
			System.out.println("Catching the throws example exception");
			ee.printStackTrace();
		}
		
	}
}
