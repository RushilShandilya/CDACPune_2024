package com.dsa.circularlist.singly;

public class Main {
    public static void main(String[] args){
        CircularSinglyList list = new CircularSinglyList();

        list.addToFront(50);
        list.addToFront(40);
        list.addToFront(30);
        list.addToFront(30);
        list.addToFront(30);
        list.addToFront(30);
        list.addToFront(20);
        list.addToFront(10);


        list.print();

        System.out.println();
        System.out.println(list.isPresent(50));
        System.out.println(list.isPresent(10));

        CircularSinglyList.head = list.deleteAll(30);

        list.print();



    }
}
