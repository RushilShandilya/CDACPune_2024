package com.dsa.queue.noncircularqueue;

public class LinkedList implements List{
    public static Node head;
    public static Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void addToBack(int element) {
        if(head==null){
            head = new Node(element);
            tail = head;
        }else{
            tail.next = new Node(element);
            tail = tail.next;
        }
    }

    @Override
    public int removeFromFront(){
        int value = head.value;
        head = head.next;

        return value;
    }

    @Override
    public int getValueAtPointer() {
        return head.value;
    }
}
