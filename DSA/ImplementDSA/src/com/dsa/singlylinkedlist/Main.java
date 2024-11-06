package com.dsa.singlylinkedlist;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();

        list.addToFront(7);
        list.addToFront(6);
        list.addToFront(5);
        list.addToFront(5);
        list.addToFront(5);


        list.addToRear(10);
        list.addToRear(20);
        list.addToRear(20);
        list.addToRear(20);
        list.addToRear(30);
        list.addToRear(40);

        list.print();

        SinglyLinkedList.head=list.deleteAll(20);

        list.print();

        SinglyLinkedList.head = list.deleteAll(5);
        list.print();
    }
}
