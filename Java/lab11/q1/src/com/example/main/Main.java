package com.example.main;

import com.example.exceptionhandling.MinimumBalanceException;
import com.example.main.Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		Menu menu = new Menu();

		do{
			menu.showMenu();
			System.out.println("Enter the option you want to enter");
			int number = sc.nextInt();

		//	System.out.println(toContinue);
			
			try{
				menu.chooseOption(number,sc);
			}catch(MinimumBalanceException e){
				e.printStackTrace();
			}catch(InputMismatchException e){
				e.getMessage();
				e.printStackTrace();
			}
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);

		//	System.out.println(toContinue);
		}while(toContinue=='y'|| toContinue=='Y');

		sc.close();
		return ;
	}
}
