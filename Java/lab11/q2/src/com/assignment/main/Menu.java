package com.assignment.main;

import com.assignment.fruit.Fruit;
import com.assignment.main.DataEntry;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Menu{
	private List<Fruit> fruitList;
	public Menu(){
		fruitList = DataEntry.createData();
	}
	public void showMenu(){
		System.out.println("Show menu");
		System.out.println("1. Add account");
		System.out.println("2. Print Fruit List");
		System.out.println("3. Sort by Color");	
		System.out.println("4. Sort by quantity");
		System.out.println("5. Sort by price");
	}
	public void createAccount(Scanner sc){
		System.out.println("Enter Fruit Name");
		String name = sc.nextLine();

		System.out.println("Enter Fruit List");
		String color = sc.nextLine();

		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();

		System.out.println("Enter Price");
		double price = sc.nextDouble();

		fruitList.add(new Fruit(name,color,quantity,price));
	}
	public void printAccount(){
		fruitList.forEach(System.out::println);
	}
	public void sortByColor(){
		Collections.sort(fruitList);
	}
	public void sortByQuantity(){
		Comparator<Fruit> sortByQuantity = new Comparator<Fruit>(){
			@Override
			public int compare(Fruit a , Fruit b){
				int x = a.getQuantity();
				int y = b.getQuantity();

				return (x<y)?1:(x==y)?0:(x>y)?-1;
			}
		};
		Collections.sort(fruitList,sortByQuantity);
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
				sortByColor();
				break;
			}
			case 4:{
				sortByQuantity();
				break;
			}
		}
	}
}
