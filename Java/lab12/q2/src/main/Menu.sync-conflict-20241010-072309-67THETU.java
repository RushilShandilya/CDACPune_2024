package src.main;

import src.jobseeker.JobSeeker;
import src.jobseeker.AccountInformation;
import src.jobseeker.BasicInformation;
import src.jobseeker.Degree;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Menu{
	private static List<JobSeeker> listOfJobSeeker = new LinkedList<>();
	public static void showMenu(){
		System.out.println("Welcome to Jobseeker account creator");
		System.out.println("1. Add Jobseeker account");
		System.out.println("2. Print all Jobseeker account");
		System.out.println("3. Update Email");
		System.out.println("4. Print all Jobseeker Degree");
		System.out.println("5. Sort Jobseeker by Email");
		System.out.println("6. Sort Jobseeker by Date Of Birth");
		System.out.println("7. Sort Jobseeker by Graduation Date");	
	}
	static LocalDate getDate(Scanner sc){	
		System.out.println("Enter DayOfMonth");
		int dayOfMonth = sc.nextInt();
		
		System.out.println("Enter Month");
		int month = sc.nextInt();
		
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		return LocalDate.of(year,month,dayOfMonth);
	}
	static BasicInformation getBasicInformation(Scanner sc){	
		sc.nextLine();
		System.out.println("Enter your Name");
		String name = sc.nextLine();

		System.out.println("Enter your 10 Digit Number Phone Number");
		String phoneNumber = sc.nextLine();
		
		System.out.println("Enter Date of Birth(in dd/MM/yyyy)");
		LocalDate dateOfBirth = getDate(sc);
		
		System.out.println("Enter the Date of Graduation(in dd/MM/yyyy)");
		LocalDate dateOfGraduation = getDate(sc);
		
		System.out.println("Enter your Degree");
		Degree degree=null;
		switch((sc.nextLine()).toUpperCase()){
			case "BTECH":{
				degree = Degree.BTECH;
				break;
			}
			case "BBA":{
				degree = Degree.BBA;
				break;
			}
			case "BCA":{
				degree = Degree.BCA;
				break;
			}
		}
		return new BasicInformation(name,UUID.randomUUID(),phoneNumber,dateOfBirth,dateOfGraduation,degree);
	}
	static AccountInformation getAccountInformation(Scanner sc){
		sc.nextLine();
		System.out.println("Enter your Email");
		String email = sc.nextLine();

		System.out.println("Enter your password");
		String password = sc.nextLine();

		return new AccountInformation(email,password);		
	}
	public static void chooseOption(Scanner sc){
		System.out.println("Please enter the option you want to choose");
		switch(sc.nextInt()){
			case 1:{
				BasicInformation basicInformation = getBasicInformation(sc);
				AccountInformation accountInformation = getAccountInformation(sc);
				listOfJobSeeker.add(new JobSeeker(basicInformation,accountInformation));
				break;
			}
			case 2:{
				listOfJobSeeker.forEach(System.out::println);	
				break;
			}
		}
		
	}
}
