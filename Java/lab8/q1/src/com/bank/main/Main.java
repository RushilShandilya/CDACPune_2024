package com.bank.main;

import com.bank.account.Account;
import com.bank.exceptionHandling.MinimumBalanceException;
import com.bank.exceptionHandling.ListFullException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main{
	public static void optionMenu(){
		System.out.println("Choose option");
		System.out.println("1.Insert Account");
		System.out.println("2.Print Account List");
	}
	public static Date parsedDate(String dateOfObject) throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.parse(dateOfObject);
	}
	public static void createAccount(Account[] account, Scanner sc) throws ParseException,ListFullException{
		sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter Date of Opening(in dd/MM/yyyy))");
		String dateOfObject = sc.nextLine();

		System.out.println("Enter Initial Amount");
		double amount = sc.nextDouble();

		int index = Account.accountNumberGenerator;
		if(index<account.length) account[index] = new Account(name,parsedDate(dateOfObject),amount);
		else throw new ListFullException("Can't create any more accounts , list full");
		
	}
	public static void chooseOption(int enterOption , Account[] account , Scanner sc) throws ParseException{
		switch(enterOption){
			case 1:{
				
				try{
					createAccount(account,sc);
				}catch(ListFullException e){
					e.printStackTrace();
				}
				break;
			}
			case 2:
			       System.out.println("Coming Soon");
				//printAccount(account);
				break;
		}
		
	}
	public static void main(String... args) throws ParseException{
		Account[] account = new Account[1];
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			optionMenu();
			chooseOption(sc.nextInt(),account,sc);

			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');

		sc.close();
		return;
	}
}
