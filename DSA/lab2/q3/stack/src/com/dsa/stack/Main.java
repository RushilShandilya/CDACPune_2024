package com.dsa.stack;

import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char toContinue;
        do{
            Menu.showMenu();
            try {
                Menu.chooseOption(sc);
            }catch(IndexOutOfBoundsException e){
                System.out.println("The exception message : " + e.getMessage());
            }
            System.out.println("Do you want to continue?");
            toContinue = sc.next().charAt(0);
        }while(toUpperCase(toContinue)=='Y');
    }
}
