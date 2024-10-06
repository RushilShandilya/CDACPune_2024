package com.assignment.main;

import com.assignment.main.DataEntry;
import com.assignment.main.Menu;
import java.util.Scanner;

public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		Menu menu = new Menu();
		do{
			menu.showMenu();
			System.out.println("Choose your option");
			int enterOption = sc.nextInt();
			menu.chooseOption(enterOption,sc);
			
			System.out.println("Do you want to continue");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y'|| toContinue =='Y');
	}
}
