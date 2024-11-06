package com.dsa.circularlist.singly;

public class CircularSinglyList implements LinkedList{
    public static Node head;
    public static Node tail;

    public CircularSinglyList(){
        head = null;
        tail = null;
    }
    @Override
    public void addToFront(int element) {
        if(head == null){
            head = new Node(element);
            tail = head;
            tail.next = head;
        }else{
            Node node = new Node(element);
            node.next = head;
            tail.next = node;
            head = node;
        }
    }

    @Override
    public void addToRear(int element) {
        if(head==null){
            head = new Node(element);
            tail = head;
        }else{
            tail.next = new Node(element);
            tail = tail.next;
        }
        tail.next = head;
    }

    @Override
    public Node deleteOnce(int element) {
        Node temp = head;
        if(head.value==element) return head.next;

        Node temp2;
        do{
            if(temp.next.value==element){
                temp2 = temp.next;
                temp.next = temp2.next;
                temp2.next = null;
            }
            temp = temp.next;
        }while(temp!=head);

        return head;
    }

    @Override
    public Node deleteAll(int element) {
        Node newHead = null , dummy = null , temp = head;
        do{
            if(temp.value!=element){
                if(newHead==null){
                    newHead = new Node(temp.value);
                    dummy = newHead;
                }else{
                    dummy.next = new Node(temp.value);
                    dummy = dummy.next;
                }
            }
            temp = temp.next;
        }while(temp!=head);

        Node temp2 = newHead;
        do{
            temp2 = temp2.next;
        }while(temp2.next!=null);
        temp2.next = newHead;

        return newHead;
    }

    @Override
    public boolean isEmpty() {
       return head==null;
    }

    @Override
    public boolean isPresent(int element) {
        Node temp = head;
        do{
            if(temp.value==element) return true;
            temp = temp.next;
        }while(temp!=head);
        return false;
    }

    @Override
    public void print() {
        Node temp = head;
        do{
            System.out.print(temp.value +"->");
            temp = temp.next;
        }while(temp!=head);
    }
}
