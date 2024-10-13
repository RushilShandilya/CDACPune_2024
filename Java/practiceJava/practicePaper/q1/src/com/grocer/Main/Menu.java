package com.grocer.Main;

import com.grocer.ExceptionHandling.NegativeQuantityException;
import com.grocer.Grocery.Item;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static List<Item> groceryList = DataUtils.createData();
    public static void showMenu(){
        System.out.println("Welcome to Grocer.A Command Line Grocery Management System.");
        System.out.println("Here is what I can do for you?");
        System.out.println("1. Add new grocery item to the list");
        System.out.println("2. Update grocery item in stock");
        System.out.println("3. Display list of grocery items");
        System.out.println("4. Remove all empty stock");
        System.out.println("5. Display product for which stock updated(in past 3 days)");
    }
    public static void chooseOption(Scanner sc) throws NegativeQuantityException{
        System.out.println("Choose the option you want");
        int enterOption  = sc.nextInt();
        switch(enterOption){
            case 1:{
                addGroceryItemToList(sc);
                break;
            }
            case 2:{
                updateGroceryItemToList(sc);
                break;
            }
            case 3:{
                printAllGroceryItems();
                break;
            }
            case 4:{
                removeAllEmptyStock();
                break;
            }
            case 5:{
                displayUpdatedStock();
                break;
            }
        }
    }
    private static boolean wasUpdated(Item item){
        List<LocalDateTime> getUpdatedList = item.getTrackQuantityChange();
        LocalDateTime getLatestUpdated = getUpdatedList.get(getUpdatedList.size()-1);

        //Will Update soon
        return false;

    }
    private static void displayUpdatedStock() {
        for(Item item : groceryList){
            if(wasUpdated(item)) System.out.println(item.toString());
        }
    }

    private static void removeAllEmptyStock() {
        groceryList.removeIf(item -> item.getQuantity() == 0);
    }

    private static void printAllGroceryItems() {
        groceryList.forEach(System.out::println);
    }

    static void updateQuantity(Item item,int quantity,Scanner sc) throws NegativeQuantityException{
        sc.nextLine();
        System.out.println("Do you want to add or remove quantity(type add or remove)");
        List<LocalDateTime> getChangeList = item.getTrackQuantityChange();
        switch((sc.nextLine()).toLowerCase()){
            case "add":{
                item.setQuantity(item.getQuantity()+quantity);
                break;
            }
            case "remove":{
                if(item.getQuantity()-quantity<0) throw new NegativeQuantityException("The quantity is more than stock");
                item.setQuantity(item.getQuantity()-quantity);
                break;
            }
        }
        getChangeList.add(LocalDateTime.now());
    }
    private static void updateGroceryItemToList(Scanner sc) throws NegativeQuantityException{
        sc.nextLine();
        System.out.println("Enter the item name you want quantity changed of?");
        String itemName = sc.nextLine();

        System.out.println("Enter the quantity you want to add or remove");
        int quantity = sc.nextInt();

        for(Item item : groceryList){
            if(item.getName().equalsIgnoreCase(itemName)){
                updateQuantity(item,quantity,sc);
            }
        }
    }

    private static void addGroceryItemToList(Scanner sc) throws IllegalArgumentException{
        sc.nextLine();
        System.out.println("Enter the grocery item details");

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Price Per Unit");
        Double price = sc.nextDouble();
        if(price<=0) throw new IllegalArgumentException("The price per unit can't be 0 or negative");


        System.out.println("Initial Quantity");
        Integer quantity = sc.nextInt();
        if(quantity<0) throw new IllegalArgumentException("The quantity is negative");


//        System.out.println("Get initial date of Entry");
//        System.out.println("Year(in yyyy)");
//        int year = sc.nextInt();
//
//        System.out.println("Month(in MM)");
//        int month = sc.nextInt();
//
//        System.out.println("DayOfMonth(in dd)");
//        int dayOfMonth = sc.nextInt();

//        LocalDate dateOfEntry = LocalDate.of(year,month,dayOfMonth);
          groceryList.add(new Item(name,price,quantity,LocalDateTime.now()));
    }
}
