package com.student.courses;

public enum Course{
	DAC("Diploma in Advanced Computing"),
	DESD("Diploma in Embedded Software Development"),
	DVLSI("Diploma in Very Large Scale Integration");

	private final String courseName;
	private Course(String courseName){
		this.courseName = courseName;
	}
	public String getCourseName(){
		return courseName;
	}
}
