package src.List.;

import src.ExceptionHandling.AccountNotFoundException;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.LocalDate;


public class Menu{
	private static List<Account> listOfAccount = new LinkedList<>();
	
	public static void showMenu(){
		System.out.println("Welcome Admin, to XYZ Account Management System");
		System.out.println("Please enter the choice you want to make");
		System.out.println("1. Add account to the database");
		System.out.println("2. Print all the account");
	}
	public static void addAccount(Scanner sc){
		System.out.println("Enter the account name);
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
		
		Account account = new Account(name,LocalDate.of(year,month,day),balance);
		listOfAccount.add(account);
	}
	public static void printAllAccount(){
		for(Account account : listOfAccount) System.out.println(account);
	}
	public static void printAccountByNumber(int givenAccountNumber) throws AccountNotFoundException{
		for(Account account : listOfAccount){
			int thisAccountNumber = account.getAccountNumber();
			if(thisAccountNumber==givenAccountNumber){
				System.out.print(account);
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
	public static void transferMoney(int fromAccountNumber , int toAccountNumber , double transferAmount) throws MinimumBalanceException{
		Account fromAccount = getAccount(fromAccountNumber);
		Account toAccount = getAccount(toAccountNumber);
		
		if(fromAccount==null || toAccount==null) throw new AccountNotFoundException("The given number doesn't have an account assigned to it");
		
		if(fromAccount.getBalance()<transferAmount) throw new MinimumBalanceException("Not sufficient balance");
		fromAccount.setBalance(fromAccount.getBalance()-transferAmount);
		toAccount.setBalance(toAccount.getBalance()+transferAmount);
	}
	public static void deleteAccount(int accountNumberToDelete) throws AccountNotFoundException{
		if(getAccount(accountNumberToDelete)==null) throw new MinimumBalanceException("The given number doesn't have an account assigned to it");
		listOfAccount.remove(accountNumberToDelete);
	}
	public static void chooseOption(int enterOption , Scanner sc) throws AccountNotFoundException , MinimumBalanceException{
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
				
			}
			case 5:{
				System.out.println("Enter your account number");
				int accountNumberToDelete = sc.nextInt();
				deleteAccount(accountNumberToDelete);
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
			}
		}
	}
}