package com.dsa.doublylinkedlist;

public class DoublyLinkedList implements LinkedList {

    public static Node head;
    public static Node tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void addToRear(int element) {
        if(head==null) {
            head = new Node(element);
            tail = head;
        }else{
            Node node = new Node(element);
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }
    }

    @Override
    public void addToFront(int element) {
        if(head==null) {
            head = new Node(element);
            tail = head;
        } else{
            Node node = new Node(element);
            node.next = head;
            head.prev = node;

            head = node;
        }
    }

    @Override
    public boolean isPresent(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.value==element) return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Node deleteOnce(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.next.value == element){
                Node temp2 = temp.next;
                temp.next = temp2.next;
                temp2.next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    @Override
    public Node deleteAll(int element) {
        Node dummyNext = null ,dummyPrev = null, newNode = null;
        while(head!=null){
            if(head.value!=element){
                if(newNode==null){
                    newNode = new Node(element);
                    dummyNext = newNode;
                    dummyPrev = newNode;
                }else{
                    Node node = new Node(element);
                    dummyNext.next = node;
                    node.prev = dummyPrev;
                    dummyPrev = node;
                    dummyNext = node;
                }
            }
           head = head.next;
        }
        return newNode;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int deleteFromFront() {
        int value = head.value;
        head = head.next;

        head.prev.next = null;
        head.prev = null;

        return value;
    }

    @Override
    public void print() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-><-");
            temp = temp.next;
        }
    }
}
