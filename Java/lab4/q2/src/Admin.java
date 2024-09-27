package com.ghoogle.admin;

import com.ghoogle.employee.Employee;
import java.util.Scanner;
import java.util.Random;

public class Admin{
	static int idGenerator = 1000;
	static void openMenu(){
		System.out.println("1. Add Employee");
		System.out.println("2. Print Employee");
		System.out.println("3. Print Employee sorted by Salary");
		System.out.println("4. Exit");
	}
	static void addEmployee(Employee[] employee,Scanner sc ){
		sc.nextLine();
		System.out.println("Enter name of the Employee ");
		String employeeName = sc.nextLine();
		System.out.println("Enter Employee Salary ");
		double salary = sc.nextDouble();

		employee[idGenerator-1000] = new Employee(idGenerator+1,employeeName,salary);
		++idGenerator;
	}
	static void printEmployee(Employee[] employee){
		int size = idGenerator-1000;
		for(int i = 0 ; i<size; ++i)System.out.println(employee[i].toString());
	}
	static void printEmployeeSortedBySalary(Employee[] employee){
		employee[0].sortBySalary(employee,idGenerator-1000);
		printEmployee(employee);
	}
	static void chooseOption(int enterOption,Employee[] employee,Scanner sc){
		switch(enterOption){
			case 1:
				addEmployee(employee,sc);
				break;
			case 2:
				printEmployee(employee);
				break;
			case 3:
				printEmployeeSortedBySalary(employee);
				break;
			default:
		}
	}
	public static void main(String... args){
		Employee[] employee = new Employee[10000];
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			openMenu();
			chooseOption(sc.nextInt(),employee,sc);
			System.out.println("Do you want to continue?(y/n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		
		return ;
	}
}
