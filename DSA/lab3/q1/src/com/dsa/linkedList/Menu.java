package com.dsa.linkedList;

import java.util.Scanner;

public class Menu {
    public static SinglyLinkedList list;
    public static void showMenu(){
        System.out.println("Singly Linked List Creator");
        System.out.println("0. Initialize an empty head");
        System.out.println("1. Add at Front");
        System.out.println("2. Add at Back");
        System.out.println("3  Delete an element from List");
        System.out.println("4. Delete all elements from List");
        System.out.println("5. Print");
    }
    public static void chooseOption(Scanner sc){
        System.out.println("Enter the option you want");
        switch(sc.nextInt()){
            case 0:{
                initialiseEmptyHead();
                break;
            }
            case 1:{
                System.out.println("Enter the value you want to enter into node");
                System.out.println("Element status : " +addToFrontOfList(sc.nextInt()));
                break;
            }
            case 2:{
                System.out.println("Enter the value you want to enter into node");
                System.out.println("Element status : "+addToRearOfList(sc.nextInt()));
                break;
            }
            case 3:{
                System.out.println("Status : " +deleteAnElement(sc));
                break;
            }
            case 4:{
                System.out.println("Status : " +deleteAllElementsFromList(sc));
                break;
            }
            case 5:{
                print();
                break;
            }

        }
    }
    public static void initialiseEmptyHead(){
       list = new SinglyLinkedList();
    }
    public static String addToFrontOfList(int element){
        list.addToFront(element);
        return element + " added successfully";
    }
    public static String addToRearOfList(int element){
        list.addToRear(element);
        return element + " added successfully";
    }
    public static void print(){
        list.print();
    }
    public static String deleteAnElement(Scanner sc){
        int number;
        System.out.println("Enter element to delete ");
        SinglyLinkedList.head = list.delete(number=(sc.nextInt()));
        return number+"deleted successfully";
    }
    public static String deleteAllElementsFromList(Scanner sc){
        int number;
        System.out.println("Enter the element you want to remove from list");
        SinglyLinkedList.head = list.deleteAll(number=(sc.nextInt()));
        return number + "removed from list successfully";
    }
}
