package com.parent;

public class ChildClass extends ParentClass{
	
	
	public void printParent() {
		
		//access parent variables
		proint = 5;
		prostr = "protected";
		
		//access default variable
		defint = 10;
		defname = "default";
		
		System.out.println("Printing the protected variables :- "+proint+" "+prostr);
		System.out.println("Printing the default variables :- "+ defint+" "+defname);
		
		printdef();
		super.printpro();
	}

	@Override
	protected void printpro() {
		
		System.out.println("Overriden in child");
	}
	
}
