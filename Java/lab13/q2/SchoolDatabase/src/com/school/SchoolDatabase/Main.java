package com.school.SchoolDatabase;

import com.school.ExceptionHandling.WrongDivisionException;
import com.school.Student.Student;
import com.school.SchoolDatabase.SchoolFunction;
import java.util.Scanner;

public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		SchoolFunction schoolFunction = new SchoolFunction();
		do{
			SchoolFunction.showMenu();
			System.out.println("Enter option you want to choose");
			int enterOption = sc.nextInt();
			
			try{
				SchoolFunction.chooseOption(enterOption,sc);
			}catch(WrongDivisionException e){
				e.printStackTrace();
			}
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		
		sc.close();
    }
}
