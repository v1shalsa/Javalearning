package com.parent;

public class NotChildClass {
	
	//Create an object of the parent class to access variable		
	ParentClass pc = new ParentClass();
		
		public void printParent() {
			
			//access parent variables
			pc.proint = 5;
			pc.prostr = "protected";
			
			//access default variable
			pc.defint = 10;
			pc.defname = "default";
			
			System.out.println("Printing the protected variables :- "+pc.proint+" "+pc.prostr);
			System.out.println("Printing the default variables :- "+ pc.defint+" "+pc.defname);
			
			pc.printpro();
			pc.printdef();
		}
		

}
