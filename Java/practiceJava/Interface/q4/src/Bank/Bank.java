package Bank;

import Account.Account;
import Account.SavingsAccount;
//import Account.CurrentAccount;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Bank{
	public static void showMenu(){
		System.out.println("Choose Option");
		System.out.println("1. Create Account");
		System.out.println("2. Print Account");
	}
	public static void chooseOption(int enterOption , Account[] account , Scanner sc) throws ParseException{
		switch(enterOption){
			case 1->createAccount(account,sc);
			case 2->printAllAccount(account);
		}
	}
	static void chooseSavingsOrCurrent(){	
		System.out.println("Choose Savings or Current");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
	}
	static Date parseDate(String date) throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.parse(date);
	}
	public static void createAccount(Account[] account , Scanner sc) throws ParseException{
		sc.nextLine();
		System.out.println("Enter Account Holder Name : ");
		String holderName = sc.nextLine();

		System.out.println("Enter Date of Creation in (dd/MM/yyyy)");
	       	String dateOfCreation = sc.nextLine();

		System.out.println("Enter Balance ");
		double balance = sc.nextDouble();

		chooseSavingsOrCurrent();
		account[Account.holderIDGenerator] = switch(sc.nextInt()){
			case 1 -> new SavingsAccount(holderName,parseDate(dateOfCreation),balance);
			//case 2 -> new CurrentAccount(holderName,parseDate(dateOfCreation),balance);
			default->null;
		};
	}
	public static void printAllAccount(Account[] account){
		int size = Account.holderIDGenerator;
		for(int i = 0 ; i<size ; ++i){
			System.out.println(account[i].toString());
		}
	}
	public static void main(String... args) throws ParseException{
		Account[] account = new Account[10000];
		Scanner sc = new Scanner(System.in);
		char toContinue;

		do{
			showMenu();
			chooseOption(sc.nextInt(),account,sc);
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		
		sc.close();
		return ;
	}
}
