package src.List;

import src.ExceptionHandling.AccountNotFoundException;
import src.ExceptionHandling.MinimumBalanceException;
import src.Account.Account;
import src.Account.SavingsAccount;
import src.List.DataUtils;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Collections;

public class Menu{
	private static List<Account> listOfAccount = DataUtils.createData();
	
	public static void showMenu(){
		System.out.println("Welcome Admin, to XYZ Account Management System");
		System.out.println("Please enter the choice you want to make");
		System.out.println("1. Add account to the database");
		System.out.println("2. Print all the account");	
		System.out.println("3. Print account by account number");
		System.out.println("4. Transfer money from one account to another account");
		System.out.println("5. Delete a particular account");
		System.out.println("6. Coming Soon");
		System.out.println("7. Sort list of account by account number");
		System.out.println("8  Sort list of account by date of opening");
	}
	public static void addAccount(Scanner sc){
		sc.nextLine();
		System.out.println("Enter the account name");
		String name = sc.nextLine();
		
		System.out.println("Date of Opening");
		System.out.println("Enter the year of opening");
		int year = sc.nextInt();
		
		System.out.println("Enter the month of opening");
		int month = sc.nextInt();
		
		System.out.println("Enter the day of opening");
		int day = sc.nextInt();
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();

		System.out.println("Is it a savings account?(y or n)");
		char savingsOrNot = sc.next().charAt(0);
		switch(savingsOrNot){
			case 'y':
			case 'Y':{		
				listOfAccount.add(new SavingsAccount(name,LocalDate.of(year,month,day),balance));
				break;
			}
			case 'n':
			case 'N':{
				listOfAccount.add(new Account(name,LocalDate.of(year,month,day),balance));
				break;
			}
		}	
	}
	public static void printAllAccount(){
		for(Account account : listOfAccount) System.out.println(account);
	}
	public static void printAccountByNumber(int givenAccountNumber) throws AccountNotFoundException{
		for(Account account : listOfAccount){
			int thisAccountNumber = account.getAccountNumber();
			if(thisAccountNumber==givenAccountNumber){
				System.out.println(account);
				return ;
			}
		}
		throw new AccountNotFoundException("The given number doesn't have an account assigned to it");
	}
	static Account getAccount(int accountNumber) throws AccountNotFoundException{
		for(Account account : listOfAccount){
			if(account.getAccountNumber()==accountNumber)
				return account;
		}
		throw new AccountNotFoundException("The given number doesn't have an account assigned to it");
	}
	public static void transferMoney(int fromAccountNumber , int toAccountNumber , double transferAmount) throws AccountNotFoundException,MinimumBalanceException{
		Account fromAccount = getAccount(fromAccountNumber);
		Account toAccount = getAccount(toAccountNumber);		
		
		if(fromAccount.getBalance()<transferAmount) throw new MinimumBalanceException("Not sufficient balance");
		fromAccount.setBalance(fromAccount.getBalance()-transferAmount);
		toAccount.setBalance(toAccount.getBalance()+transferAmount);
	}
	public static void deleteAccount(int accountNumberToDelete) throws AccountNotFoundException{
		listOfAccount.remove(accountNumberToDelete-1);
	}
	public static void chooseOption(Scanner sc) throws AccountNotFoundException,MinimumBalanceException{
		int enterOption = sc.nextInt();
		switch(enterOption){
			case 1:{
				addAccount(sc);
				break;
			}
			case 2:{
				printAllAccount();
				break;
			}
			case 3:{
				System.out.println("Enter account Number : ");
				int accountNumber = sc.nextInt();
				printAccountByNumber(accountNumber);
				break;
			}
			case 4:{
				System.out.println("Enter your account Number");
				int fromAccountNumber = sc.nextInt();
				System.out.println("Enter the account Number you want to transfer to");
				int toAccountNumber = sc.nextInt();
				System.out.println("Enter the amount of money you want to transfer");
				double transferAmount = sc.nextDouble();
				
				transferMoney(fromAccountNumber,toAccountNumber,transferAmount);
				break;	
			}
			case 5:{
				System.out.println("Enter your account number");
				int accountNumberToDelete = sc.nextInt();
				deleteAccount(accountNumberToDelete);
				break;
			}
			case 6:{
				System.out.println("Coming Soon");
				break;
			}
			case 7:{
				Collections.sort(listOfAccount);
				break;
			}
			case 8:{
				Collections.sort(listOfAccount,(a,b)->{
					LocalDate dateA = a.getDateOfOpening();
					LocalDate dateB = b.getDateOfOpening();
					
					if(dateA.isAfter(dateB)) return 1;
					else if(dateA.isEqual(dateB)) return 0;
					else return -1;
				});
				break;
			}
		}
	}
}
