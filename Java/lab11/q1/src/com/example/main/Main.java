package com.example.main;

import com.example.main.Menu;
import java.time.LocalDate;
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
			
			menu.chooseOption(number,sc);

			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);

		//	System.out.println(toContinue);
		}while(toContinue=='y'|| toContinue=='Y');

		sc.close();
		return ;
	}
}
