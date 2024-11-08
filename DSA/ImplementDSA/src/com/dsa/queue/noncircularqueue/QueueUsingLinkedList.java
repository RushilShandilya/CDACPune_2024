package com.dsa.queue.noncircularqueue;

public class QueueUsingLinkedList implements Queue{
    public static LinkedList list;
    public QueueUsingLinkedList(){
        list = new LinkedList();
    }
    @Override
    public void enqueue(int element) {
        list.addToBack(element);
    }

    @Override
    public int dequeue() throws IndexOutOfBoundsException{
        if(!isEmpty()) return list.removeFromFront();
        throw new IndexOutOfBoundsException("Queue is Empty");
    }

    @Override
    public boolean isEmpty() {
        return LinkedList.head==null;
    }

    @Override
    public int peek() throws IndexOutOfBoundsException{
        if(!isEmpty()) return list.getValueAtPointer();
        else throw new IndexOutOfBoundsException("Queue is Empty");
    }
}
