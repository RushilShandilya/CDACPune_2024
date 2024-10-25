package com.dsa.linkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.deleteElement(10);

        //list.addAtRear(10);
        list.addAtRear(20);
        list.addAtRear(20);
        //list.addAtRear(30);
        //list.addAtRear(40);

        list.print();

        System.out.println();

        //SinglyLinkedList.head= list.deleteElement(30);
        //list.print();
        //
        //System.out.println();

        SinglyLinkedList.head = list.deleteAllElement(20);
        list.print();

    }
}
