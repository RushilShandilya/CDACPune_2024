package com.dsa.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.addToFront(50);
        list.addToFront(40);
        list.addToFront(30);
        list.addToFront(20);
        list.addToFront(10);

        list.print();
        System.out.println();

        list.addToRear(60);
        list.addToRear(70);
        list.addToRear(80);

        list.print();
    }
}
