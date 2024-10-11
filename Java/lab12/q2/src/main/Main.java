package src.main;

import src.main.Menu;
import java.util.Scanner;

public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			Menu.showMenu();
			Menu.chooseOption(sc);	
			
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);

		}while(toContinue=='y'||toContinue=='Y');
		return ;
	}
}
