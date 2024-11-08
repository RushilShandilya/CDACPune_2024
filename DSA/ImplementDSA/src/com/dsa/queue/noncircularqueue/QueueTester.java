package com.dsa.queue.noncircularqueue;

public class QueueTester {
    public static void main(String[] args){
        int[] insertIntoQueue = new int[]{10,20,30,40,50};
        QueueUsingLinkedList list = new QueueUsingLinkedList();

        for(int x : insertIntoQueue) list.enqueue(x);

        while(!list.isEmpty()) System.out.print(list.dequeue() + " ");
    }
}
