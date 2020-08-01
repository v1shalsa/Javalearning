package com.exception.learn;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class RuntimeExample {
	
	public void divideNumbers(int num1,int num2) {
		File file = new File("student.xml");
	    //creating the JAXB context
	 //   JAXBContext jContext = JAXBContext.newInstance(Student.class);
	    //******Here we have to compulsory handle JAXBException*****
	    //creating the unmarshall object
	  //  Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
	    //calling the unmarshall method
		
	}

}
