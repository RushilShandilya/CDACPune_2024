package com.aadhar.main;

import com.aadhar.address.Address;
import com.aadhar.person.Person;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.text.ParseException;

public class Main{
	static int size=0;
	public static void openMenu(){
		System.out.println("Choose given option below");
		System.out.println("1. Enter Person Details");
		System.out.println("2. Print Person Details");
		System.out.println("3. Check if person is born before 1947");
	}
	public static Address getAddress(Scanner sc){
		System.out.println("Enter Flatnumber");
		String flatNumber = sc.nextLine();
		
		System.out.println("Enter Area");
		String area = sc.nextLine();
		
		System.out.println("Enter Landmark");
		String landmark = sc.nextLine();
		
		System.out.println("Enter Pincode");
		String pincode = sc.nextLine();
		
		return new Address(flatNumber,area,landmark,pincode);
	}
	public static void addPerson(Person[] person , Scanner sc) throws ParseException{
		sc.nextLine();
		System.out.println("Enter person name");
		String enterName = sc.nextLine();
		
		System.out.println("Enter Date of Birth(in dd/mm/yyyy)");
		String dateOfBirth = sc.nextLine();
		
		//SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
		Date date = parseDate.parse(dateOfBirth);
		
		Address personAddress = getAddress(sc);
		
		person[size] = new Person(UUID.randomUUID(),enterName,date,personAddress);
		++size;
	}
	public static void printPerson(Person[] person){
		
		for(int i = 0 ; i<size ; ++i) System.out.println(person[i].toString());
	}
	public static void wasBornBeforeIndependence(Person[] person) throws ParseException{
		String independence = "15/08/1947";
		SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
		Date independenceDay = parseDate.parse(independence);

		for(int i = 0 ; i<size ; ++i){
			if(person[i].getDateOfBirth().before(independenceDay))
				System.out.println(person[i].toString());
		}
	}
	public static void chooseOption(int enterOption , Person[] person,Scanner sc) throws ParseException{
		switch(enterOption){
			case 1: 
					addPerson(person,sc);
					break;
			case 2:
					printPerson(person);
					break;
			case 3:
					wasBornBeforeIndependence(person);
					break;
		}
	}
	public static void main(String... args) throws ParseException{
		Person[] person = new Person[10000];
		Scanner sc = new Scanner(System.in);
		char toContinue;
		
		do{
				openMenu();
				chooseOption(sc.nextInt(),person,sc);
				
				System.out.println("Do you want to continue?(y or n)");
				toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		return ;
	}
}
