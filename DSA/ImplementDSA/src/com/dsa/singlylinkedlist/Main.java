package com.dsa.singlylinkedlist;

import static com.dsa.singlylinkedlist.SinglyLinkedList.head;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        int[] front = new int[]{7,6,5,5,5};
        for(int i : front) list.addToFront(i);

        int[] last = new int[]{10,20,20,20,30,40};
        for(int i : last) list.addToRear(i);

        list.print();

        head=list.deleteAll(20);

        list.print();

        head = list.deleteAll(5);
        list.print();

        list.add(15,1);
        list.print();

        head = list.reverseList(head);
        list.print();
    }
}
