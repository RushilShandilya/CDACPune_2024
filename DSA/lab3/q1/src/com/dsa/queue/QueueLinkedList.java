package com.dsa.queue;

import com.dsa.linkedList.SinglyLinkedList;

public class QueueLinkedList implements Queue{
    public static SinglyLinkedList list;

    public QueueLinkedList(){
        list =  new SinglyLinkedList();
    }

    @Override
    public void enqueue(int element){
        list.addToRear(element);
    }

    @Override
    public int dequeue() {
        return list.removeFromFront();
    }

    @Override
    public boolean isEmpty() {
        return SinglyLinkedList.head ==null;
    }
}
