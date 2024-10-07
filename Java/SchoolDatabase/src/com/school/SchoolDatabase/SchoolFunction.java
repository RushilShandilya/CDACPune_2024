package com.school.SchoolDatabase;

import com.school.Student.Student;
import com.school.ExceptionHandling.WrongDivisionException;

import java.util.*;

public class SchoolFunction{
	private static Map<Integer,List<TreeMap<Integer,Student>>> mapOfClass;
	public SchoolFunction(){
        mapOfClass= new TreeMap<>();
		for(int i = 0 ; i<11 ; ++i) mapOfClass.put(i+1, new ArrayList<>());
	}
	public static void showMenu(){
		System.out.println("Welcome Admin, to XYZ School Management System");
		System.out.println("Please enter the choice you want to make");
		System.out.println("1. Add Student to the Database");
		System.out.println("2. Print list of all students");
		System.out.println("3. Print list of student by a standard");
		System.out.println("4. Print list of student by a section");
		System.out.println("5. Find information of a particular student");
	}
	public static void addStudent(Scanner sc){

		sc.nextLine();
		System.out.println("Enter the name");
		String name = sc.nextLine();

		System.out.println("Enter his division");
		int division = sc.nextInt();

		System.out.println("Enter his section");
		char section = Character.toUpperCase(sc.next().charAt(0));

		System.out.println("Enter his Roll Number");
		int rollNumber = sc.nextInt();

		int alphabetValue = section-65;
		List<TreeMap<Integer,Student>> listOfSection = mapOfClass.get(division);
		if(listOfSection.isEmpty()) {
			for (int i = 0; i <= alphabetValue; ++i) {
					TreeMap<Integer, Student> listOfRollNumberForSection = new TreeMap<>();
					listOfSection.add(listOfRollNumberForSection);
			}
		}else{
			for(int i = 0 ; i<=alphabetValue ; ++i){
				if(listOfSection.get(i)!=null){
					TreeMap<Integer, Student> listOfRollNumberForSection = new TreeMap<>();
					listOfSection.add(listOfRollNumberForSection);
				}
			}
		}
		listOfSection.get(alphabetValue).put(rollNumber,new Student(name,division,section));
		System.out.println(mapOfClass);
	}
	public static void findStudent(Scanner sc){
		System.out.println("Enter his division");
		int division = sc.nextInt();

		System.out.println("Enter his section");
		char section = Character.toUpperCase(sc.next().charAt(0));
		int positionValue = section-65;

		System.out.println("Enter his Roll Number");
		int rollNumber = sc.nextInt();
		System.out.println(mapOfClass.get(division).get(positionValue).get(rollNumber));
	}

	public static void chooseOption(int enterOption , Scanner sc) throws WrongDivisionException{
			switch(enterOption){
				case 1:{
					addStudent(sc);
					break;
				}
				case 2:{
					System.out.println("Coming Soon");
					//printAllStudent();
					break;
				}
				case 3:{
					System.out.println("Coming Soon");
					//printStudentByStandard();
					break;
				}
				case 4:{
					System.out.println("Coming Soon");
					//printStudentBySection();
					break;
				}
				case 5:{
					//System.out.println("Coming Soon");
					findStudent(sc);
					break;
				}
				default:
					break;
			}
	}
}
