package com.student.student;
import com.student.courses.Course;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student{
	private int studentID;
	private String studentName;
	private Date studentDateOfBirth;
	private String studentCourse;

	public static int studentIDGenerator = 100;

	public Student(){}
	public Student(String studentName,Date studentDateOfBirth,String studentCourse){
		studentID = studentIDGenerator++;
		this.studentName = studentName;
		this.studentDateOfBirth = studentDateOfBirth;
		this.studentCourse = studentCourse;
	}
	public int getStudentID(){
		return this.studentID;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public Date getStudentDateOfBirth(){
		return this.studentDateOfBirth;
	}
	public String getStudentCourse(){
		return this.studentCourse;
	}
	String getFormatDate(Date date){
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		return formatDate.format(date);
	}
	
	@Override
	public String toString(){
		return "Student:[ID:" + getStudentID()
			+ " Name:" + getStudentName()
			+ " Date_of_Birth:" + getFormatDate(getStudentDateOfBirth())
			+ " Course:" + getStudentCourse()
			+ "]";
	}
	
}
