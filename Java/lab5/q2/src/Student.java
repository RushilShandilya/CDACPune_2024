package com.student.info;
public class Student{
		private int studentRollNumber;
		private String studentName;
		private int studentAverageMarks;
		
	public Student(int studentRollNumber , String studentName,int studentAverageMarks){
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.studentAverageMarks = studentAverageMarks;
	}
	public int getStudentRollNumber(){
		return this.studentRollNumber;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public int getStudentAverageMarks(){
		return this.studentAverageMarks;
	}
	public String toString(){
			return ("Student[Name:" + this.getStudentName() 
							+" RollNumber: "+this.getStudentRollNumber() 
							+" Marks: " +this.getStudentAverageMarks()
							+" ]");
	}
	public void sortByMarks(Student[] arrayOfStudents,int size){
		for(int i = 0 ; i<size ; ++i){
			for(int j = i+1 ; j<size ; ++j){
				int marksOfI = arrayOfStudents[i].getStudentAverageMarks();
				int marksOfJ = arrayOfStudents[j].getStudentAverageMarks();
			
				if(marksOfI>marksOfJ){
					Student temp = arrayOfStudents[i];
					arrayOfStudents[i] = arrayOfStudents[j];
					arrayOfStudents[j] = temp;
				}
			}
		}
	}
}











       
