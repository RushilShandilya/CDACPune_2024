package com.dsa.hashinglinkedlist;

public class LinkedList implements List{
    private static Node head;
    private static Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void insert(int element) {
        Node node = new Node(element);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = tail.next;
        }
    }

    @Override
    public boolean search(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.value == element) return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }
}
