package com.dsa.circularlist.doubly;

public class DoublyController {
    public static void main(String[] args){
        try {
            int[] values = new int[]{50, 40, 30, 20, 10};
            DoublyLinkedList list = new DoublyLinkedList();

            for (int x : values) list.insertToFront(x);
            list.print();
            System.out.println();

            list.insertToBack(60);
            list.insertToBack(70);

            list.print();
            System.out.println();

            list.insertInBetween(15, 1);
            list.insertInBetween(25, 3);
            list.print();
            System.out.println();

            while (!list.isEmpty()) {
                System.out.print(list.deleteFromFront() + " ");
            }
            System.out.println();

           // DoublyLinkedList list = new DoublyLinkedList();

            for (int x : values) list.insertToFront(x);
            list.print();
            System.out.println();

            while(!list.isEmpty()) System.out.print(list.deleteFromBack()+" ");

        }catch(LinkedListException e){
            System.out.println(e.getMessage() + " ");
        }
    }
}
