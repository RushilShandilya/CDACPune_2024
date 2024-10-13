package com.grocer.Main;

import com.grocer.ExceptionHandling.NegativeQuantityException;

import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        char toContinue;
        do{
            Menu.showMenu();
            try {
                Menu.chooseOption(sc);
            }catch(IllegalArgumentException | NegativeQuantityException e){
                System.out.println("The error message is :" + e.getMessage());
            }
            System.out.println("Do you want to continue?(y or n)");
            toContinue = sc.next().charAt(0);
        }while(toContinue=='y'||toContinue=='Y');
    }
}
