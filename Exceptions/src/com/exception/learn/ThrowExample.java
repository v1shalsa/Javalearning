package com.exception.learn;

public class ThrowExample {
	
	public void throwMethod(int i,int j) {
				//some statements
		
		System.out.println("I am an throw keyword example");

		try {
		if(i<j) throw new ContextException();
		{
			System.out.println("Adding the variables");
			int z = i+j;
			System.out.println("Total = "+z);
		}				
		
		}catch(ContextException ee) {
			System.out.println("We are catching that throw exception here :-");
			ee.printStackTrace();
		}
	}

}
