package com.example.main;

import com.example.account.Account;
import com.example.main.DataCreation;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AccountNumberDescOrder implements Comparator<Account>{
	@Override
	public int compare(Account a, Account b){
		int x = a.getNumber();
		int y = b.getNumber();
		
		if(x<y) return 1;
		else if(x==y) return 0;
		else return -1;
	}
}
public class Menu{
	private int enterNumber;
	private List<Account> accountList;
	
	public Menu(){
		accountList = DataCreation.createData();
	}
	public List<Account> getAccountList(){ return this.accountList; }
	public void showMenu(){
		System.out.println("Welcome to the Menu");	
		System.out.println("1. Add account");
		System.out.println("2. Print all accounts");
		System.out.println("3. Sort by Account Number in Desc");
		System.out.println("4. Sort by Account Name");
		System.out.println("5. Sort by Date of Opening");
		System.out.println("6. Sort by balance desc");
		System.out.println("7. Exit"); 
	}
	public void createAccount(Scanner sc){
		sc.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String name = sc.nextLine();

		System.out.println("Date of Opening");
		System.out.println("Enter Year");
		int year = sc.nextInt();
		System.out.println("Enter Month");
		int month = sc.nextInt();
		System.out.println("Enter Date");
		int day = sc.nextInt();
		LocalDate dateOfCreation = LocalDate.of(year,month,day);
		
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		
		accountList.add(new Account(name,dateOfCreation,balance));

		//sc.close();
	}
	public void printAccount(){
		int size = Account.numberGenerator;
		for(int i = 0 ; i<size ; ++i) System.out.println(accountList.get(i).toString());
	}
//	public void exit(Scanner sc, char toContinue){
//		System.out.println("Do you want to continue? (y or n)");
//		toContinue = sc.next().charAt(0);
//		return ;
//	}
	public void sortByAccountName(){
		Comparator<Account> LexicographicComparator = new Comparator<Account>(){
			@Override
			public int compare(Account a , Account b){
				String str1 = a.getName();
				String str2 = b.getName();

				return str1.compareTo(str2);
			}	
		};
		
		Collections.sort(accountList,LexicographicComparator);
	}
	public void sortByAccountNumberDesc(){
		Collections.sort(accountList, new AccountNumberDescOrder());	
	}
	public void sortByDateOfOpening(){
		Comparator<Account> sortByDate = new Comparator<>(){
			@Override
			public int compare(Account a, Account b){
				LocalDate x = a.getDateOfOpening();
				LocalDate y = b.getDateOfOpening();
				
				return x.compareTo(y);
			}
		};
		Collections.sort(accountList,sortByDate);
	}
	public void sortByBalanceDesc(){
		Comparator<Account> sortByBalanceDesc = new Comparator<>(){
			@Override
			public int compare(Account a, Account b){
				double x = a.getBalance();
				double y = b.getBalance();

				if(x<y) return 1;
				else if(x==y) return 0;
				else return -1;
			}
		};
		Collections.sort(accountList,sortByBalanceDesc);
	}
	public void chooseOption(int enterOption,Scanner sc){
		switch(enterOption){
			case 1:{
				createAccount(sc);
				break;
			}
			case 2:{
				printAccount();
				break;
			}
			case 3:{
				//System.out.println("Coming Soon");
				sortByAccountNumberDesc();
				break;
			}
			case 4:{

				//System.out.println("Coming Soon");
				sortByAccountName();
				break;
			}
			case 5:{
				//System.out.println("Coming Soon");
				sortByDateOfOpening();
				break;
			}
			case 6:{	
				//System.out.println("Coming Soon");
				sortByBalanceDesc();
				break;
			}
		}
		//exit(sc,toContinue);
	}
}
