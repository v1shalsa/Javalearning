package com.exception.learn;

public class MainStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementorClass ic = new ImplementorClass();
		ic.someMethod();
		HandleThrowException he = new HandleThrowException();
		he.handleThatThrow();
		
		System.out.println("End of Main class. Successfully handled allexceptions");
	}

}
