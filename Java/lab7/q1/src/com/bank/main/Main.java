package com.bank.main;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.bank.account.Account;
import com.bank.savings.SavingAccount;
import com.bank.current.CurrentAccount;
import com.bank.deposit.DepositAccount;
import java.text.ParseException;

public class Main{
	public static void openMenu(){
		System.out.println("Choose the correct option");
		System.out.println("1. Create Account");
		System.out.println("2. Print Account");
	}
	public static String enterName(Scanner sc){
		sc.nextLine();
		System.out.println("Enter Account Name");
		String accountName = sc.nextLine();
		
		return accountName;
	}
	public static Date enterDate(Scanner sc) throws ParseException{
		System.out.println("Enter Date of Opening(in dd/MM/yyyy)");
		String dateOfOpening = sc.nextLine();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = simpleDateFormat.parse(dateOfOpening);
		
		return date;
	}	
	public static double enterAmount(Scanner sc){
		System.out.println("Enter Amount to deposit");
		double amount = sc.nextDouble();
		
		return amount;
	}

	public static void chooseParticularAccount(Account[] account,Scanner sc) throws ParseException{
		System.out.println("Choose which type you want to create?(Enter digit)");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Deposit Account");
		
		int index = Account.accountNumberGenerator;
		int enterOption = sc.nextInt();
		switch(enterOption){
			case 1:
				account[index] = new SavingAccount(enterName(sc),enterDate(sc),enterAmount(sc));
				break;
			case 2:
				account[index] = new CurrentAccount(enterName(sc),enterDate(sc),enterAmount(sc));
				break;
			case 3:
				account[index] = new DepositAccount(enterName(sc),enterDate(sc),enterAmount(sc));
				break;
		}
	}
	public static void printAccounts(Account[] account){
		int size = Account.accountNumberGenerator;
		Account accountReference = null;
		for(int i = 0 ; i<size ; ++i){
			System.out.println(account[i].toString());
		}
	}
	public static void chooseOption(int enterOption, Account[] account,Scanner sc) throws ParseException{
		switch(enterOption){
			case 1:
				chooseParticularAccount(account,sc);
				break;
			case 2:
				printAccounts(account);
				//System.out.println("Coming Soon");
				break;
		}
	}
	public static void main(String... args) throws ParseException{
		char toContinue;
		Scanner sc = new Scanner(System.in);
		Account[] account = new Account[10000];
		do{
			openMenu();
			chooseOption(sc.nextInt(),account,sc);
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		
		return ;
	}
}
