package src.main;

import src.jobseeker.JobSeeker;
import src.jobseeker.AccountInformation;
import src.jobseeker.BasicInformation;
import src.jobseeker.Degree;
import src.main.DataUtils;


import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Menu{
	private static List<JobSeeker> listOfJobSeeker = DataUtils.createDummyData();
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
	static Degree getDegree(String enterDegree){
		switch(enterDegree){
			case "BTECH":{
				System.out.println("In BTech");
				return Degree.BTECH;
			}
			
			case "BBA":{
				System.out.println("In BBA");
				return Degree.BBA;
			}
			
			case "BCA":{
				System.out.println("In BCA");
				return Degree.BCA;
			}
			
			default:{
				System.out.println("In default");
				return null;
			}
			
		}
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
		
		sc.nextLine();
		System.out.println("Enter your Degree");
		Degree degree = getDegree((sc.nextLine()).toUpperCase());
		return new BasicInformation(name,UUID.randomUUID(),phoneNumber,dateOfBirth,dateOfGraduation,degree);
	}
	static void updateEmail(int registrationID, String updatedEmail){
			for(JobSeeker jobSeeker : listOfJobSeeker){
				if(jobSeeker.getAccountInformation().getRegistrationID()==registrationID){
					jobSeeker.getAccountInformation().setEmail(updatedEmail);
					return ;
				}
			}
	}
	static AccountInformation getAccountInformation(Scanner sc){
		System.out.println("Enter your Email");
		String email = sc.nextLine();

		System.out.println("Enter your password");
		String password = sc.nextLine();

		return new AccountInformation(email,password);		
	}
	static void printByDegree(String degreeValue){
		Degree degree = getDegree(degreeValue);
		for(JobSeeker jobSeeker : listOfJobSeeker){
			if(jobSeeker.getBasicInformation().getGraduationDegree()==degree)
					System.out.println(jobSeeker.toString());
		}
		
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
			case 3:{
				System.out.println("Enter the Registration ID");
				int registrationID = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the updated Email");
				String updatedEmail = sc.nextLine();
				
				updateEmail(registrationID,updatedEmail);

				break;
			}
			case 4:{
				System.out.println("Enter the Degree you want to filter job seekers by");
				sc.nextLine();
				printByDegree((sc.nextLine()).toUpperCase());
				break;
			}
			case 5:{
				Collections.sort(listOfJobSeeker);
				break;
			}
			case 6:{
				Collections.sort(listOfJobSeeker,(a,b)->{
					LocalDate x = a.getBasicInformation().getDateOfBirth();
					LocalDate y = b.getBasicInformation().getDateOfBirth();
					
					return x.compareTo(y);
				});
				break;
			}
			case 7:{
				Collections.sort(listOfJobSeeker,(a,b)->{
					LocalDate x = a.getBasicInformation().getGraduationDate();
					LocalDate y = b.getBasicInformation().getGraduationDate();
				
					return x.compareTo(y);
				});
			}
		}
		
	}
}
