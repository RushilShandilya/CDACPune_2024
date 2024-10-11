package src.tester;

import src.tester.Menu;
import src.exceptionhandling.DuplicateBookFoundException;
import src.exceptionhandling.BookNotFoundException;

import java.util.Scanner;

public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			Menu.showMenu();
			try{
				Menu.chooseOption(sc);
			}catch(DuplicateBookFoundException e){
				System.out.println("Duplicate Book Exception :" + e.getMessage());
			}catch(BookNotFoundException e){
				System.out.println("Book Not Found Exception :" + e.getMessage());
			}
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
	}
}