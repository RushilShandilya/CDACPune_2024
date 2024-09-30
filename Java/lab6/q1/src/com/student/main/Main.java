package com.student.main;

import java.text.ParseException;
import com.student.student.Student;
import com.student.courses.Course;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
	static void openMenu(){
		System.out.println("Choose your option");
		System.out.println("1. Add Student ");
		System.out.println("2. Print Student List ");
	}
	static void chooseOption(int enterOption,Student[] student , Scanner sc) throws ParseException{
		switch(enterOption){
			case 1 -> addStudent(sc,student);
			case 2 -> printStudent(student);
		}
	}
	static void printStudent(Student[] student){
		int size = Student.studentIDGenerator-100;
		for(int i = 0 ; i<size ; ++i) System.out.println(student[i].toString());
	}
	static void addStudent(Scanner sc , Student[] student) throws ParseException{
		sc.nextLine();
		System.out.println("Enter name : ");
		String employeeName = sc.nextLine();

		System.out.println("Enter date of birth : ");
		String date = sc.nextLine();	
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");	

		Date date2 = simpleDateFormat.parse(date);
		
		System.out.println("Choose course name (type course name) ");
		System.out.println("1. DAC");
		System.out.println("2. DESD");
		System.out.println("3. DVLSI");

		String courseName = sc.nextLine();
		Course course=switch(courseName){
			case "DAC","dac" -> Course.DAC;
			case "DESD","desd" -> Course.DESD;
			case "DVLSI","dvlsi" ->Course.DVLSI;
			default -> null;
		};
	
		int index = Student.studentIDGenerator-100;	
		student[index] = new Student(employeeName,date2,course.getCourseName());

	}	
	public static void main(String... args) throws ParseException{
		Scanner sc = new Scanner(System.in);		
		Student[] student = new Student[10000];
		char toContinue;

		do{
			openMenu();
			int enterOption = sc.nextInt();
			chooseOption(enterOption,student,sc);
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='Y' || toContinue=='y');
	}
}
