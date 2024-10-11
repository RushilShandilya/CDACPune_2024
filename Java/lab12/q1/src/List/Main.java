package src.List; 

import src.ExceptionHandling.AccountNotFoundException;
import src.ExceptionHandling.MinimumBalanceException;
import src.List.DataUtils;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			try{
				Menu.showMenu();
				Menu.chooseOption(sc);
			}catch(AccountNotFoundException e){
				System.out.println("Account Not Found Exception : " + e.getMessage());
			}catch(MinimumBalanceException e){
				System.out.println("Minimum Balance Exception : " + e.getMessage());
			}
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');

		sc.close();
		return ;
	}
}
