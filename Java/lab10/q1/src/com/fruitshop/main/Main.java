package com.fruitshop.main;

import com.fruitshop.fruit.Fruit;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main{
	public static void main(String... args){
		ArrayList<Fruit> fruitList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{
			System.out.println("Enter Fruit Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Fruit Color");
			String color = sc.nextLine();
			
			System.out.println("Enter Price of One Fruit");
			double price = sc.nextDouble();

			System.out.println("Enter quantity of the fruit");
			int quantity = sc.nextInt();

			fruitList.add(new Fruit(name,color,price,quantity));	
		
			System.out.println("Do you want to continue?(y or n)");
			toContinue = sc.next().charAt(0);
			sc.nextLine();
		}while(toContinue=='y' || toContinue=='Y');
		
		for(Fruit fruit : fruitList){
			System.out.println(fruit.toString());
		}
		fruitList.forEach(System.out::println);

		Iterator<Fruit> iterator = fruitList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		ListIterator<Fruit> listIterator = fruitList.listIterator(fruitList.size()-1);
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}

		System.out.println("Enter the index you want to delete");
		int index = sc.nextInt();
		if(!(index<0 || index>fruitList.size()-1))
			fruitList.remove(index);

		sc.close();
		return;	
	}
}
