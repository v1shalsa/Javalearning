package com.sort;

public class Student implements Comparable{
	
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public int compareTo(Object t) {
		Student o= (Student) t;
		
		if(this.cgpa==o.cgpa)
		{
			if(this.fname.equals(o.fname)) {
				return this.id - o.id;
			}	
			else
				return this.fname.compareTo(o.fname);
		}		
		else if(this.cgpa >o.cgpa)
			return -1;
		else
			return 1;
	}

	@Override 
	public String toString() {
		return fname;
	}
}
