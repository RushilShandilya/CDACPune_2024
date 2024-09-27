package com.student.test;
import com.student.info.Student;
import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

public class Main{
	static int idGenerator = 1000;
	static void callMenu(){
		System.out.println("1. Add Student");	
		System.out.println("2. Print Student by Roll Number");
		System.out.println("3. Print All students sorted by marks");
		System.out.println("4. Exit");
	}
	static void addStudent(Student[] student,Scanner sc){
		sc.nextLine();
		System.out.println("Enter the name of student");
		String studentName = sc.nextLine();
		System.out.println("Enter the average marks of student");
		int averageMarks = sc.nextInt();
		student[idGenerator-1000] = new Student(idGenerator+1,studentName,averageMarks);
		++idGenerator;
	}
	static void printStudent(Student[] student , int size){
		for(int i = 0 ; i<size ; ++i) System.out.println(student[i].toString());
	}
	static void printStudentBySort(Student[] student){
		student[0].sortByMarks(student,idGenerator-1000);
		printStudent(student,idGenerator-1000);		
		return ; 
	}
	static void chooseOption(int enterOption,Student[] student,Scanner sc){
		switch(enterOption){
			case 1:{
				addStudent(student,sc);
				break;
			}
			case 2:{
				printStudent(student,idGenerator-1000);
				break;
			}
			case 3:{
				printStudentBySort(student);
				break;
			}
			default:
				
		}
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[10000];
		char toContinue;
		int index=0;
		do{
			callMenu();
			chooseOption(sc.nextInt(),student,sc);
			System.out.println("Do you want to continue?(y/n)");
			toContinue=sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');	
		return ;
	}
}
