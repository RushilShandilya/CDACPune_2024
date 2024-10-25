package com.dsa.queue;

public class Main {
    public static void main(String[] args){
            QueueLinkedList queueList = new QueueLinkedList();

            queueList.enqueue(10);
            queueList.enqueue(20);
            queueList.enqueue(30);

            System.out.println(queueList.dequeue());
            System.out.println(queueList.dequeue());
            System.out.println(queueList.dequeue());
            try{
                int x=queueList.dequeue();
            }catch(IndexOutOfBoundsException e){
                System.out.println("The exception message : " + e.getMessage());
            }
    }
}
