package com.dsa.doublylinkedlist;

import com.dsa.doublylinkedlist.LinkedList;

import java.io.PrintWriter;

public class DoublyLinkedList implements LinkedList {
    public static Node head;
    public DoublyLinkedList(){
        head = null;
    }
    @Override
    public void addAtFront(int element) {
        Node node = new Node(element);
        if(head!=null){
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    @Override
    public void addAtRear(int element) {
        Node node = new Node(element);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
    }

    @Override
    public Node deleteFirstNode() throws NullPointerException {
        if(head==null) throw new NullPointerException("Linked List is Empty");
        head.next.prev = null;
        return head.next;
    }

    @Override
    public Node deleteElement(int element) throws NullPointerException{
        if(head==null) throw new NullPointerException("Linked List is empty");
        if(head.value == element) {
            head.next.prev = null;
            return head.next;
        }
        Node temp = head;
        while(temp.value!=element){
             temp=temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return head;
    }

    @Override
    public Node deleteAllElement(int element) throws NullPointerException{
        Node dummy = null , newHead = null;
        if(head==null) throw new NullPointerException("LinkedList is empty");

        while(head!=null){
            if(head.value!=element){
                Node node = new Node(head.value);
                if(dummy==null){
                    dummy = node;
                    newHead = node;
                }else{
                    dummy.next = node;
                    dummy.next.prev = dummy;
                    dummy = dummy.next;
                }
            }
            head = head.next;
        }
        return newHead;
    }

    @Override
    public boolean searchList(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.value == element) return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean isListEmpty() {
        return head==null;
    }

    @Override
    public void print() {
//        try(PrintWriter printWriter = new PrintWriter(System.out,true)){
//            char tab ='↹';
//            Node temp = head;
//            while(temp!=null){
//                printWriter.print(" |" + temp.value + "| " +tab);
//                temp=temp.next;
//            }
//        }
//      System.out.println();

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
