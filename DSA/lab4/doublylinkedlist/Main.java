package com.dsa.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        try{
            DoublyLinkedList list = new DoublyLinkedList();
            //list.deleteElement(10);

            list.addAtFront(50);
            list.addAtFront(40);

            list.deleteFirstNode();

            list.addAtFront(30);
            list.addAtFront(20);
            list.addAtFront(10);
            list.addAtRear(10);
            list.addAtRear(20);
            list.addAtRear(30);
            list.addAtRear(40);

            list.print();
            System.out.println();

            DoublyLinkedList.head = list.deleteAllElement(10);

            list.print();
        }catch(NullPointerException e){
            System.out.println("The exception message : " + e.getMessage());
        }
    }
}
