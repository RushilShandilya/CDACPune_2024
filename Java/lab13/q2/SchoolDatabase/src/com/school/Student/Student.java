package com.school.Student;

public class Student{
	private String name;
	private int division;
	private char section;
	
	public Student(String name,int division , char section){
		this.name = name;
		this.division = division;
		this.section = section;
	}
	
	public String getName(){
		return name;
	}
	//public int getRollNumber(){
	//	return rollNumber;
	//}
	public int getDivision(){
		return division;
	}
	public char getSection(){
		return section;
	}
	
	@Override
	public String toString(){
		return "Student:[Name=" + getName()
				+" Division=" + getDivision()
				+" Section=" + getSection()
				+"]";
	}
}