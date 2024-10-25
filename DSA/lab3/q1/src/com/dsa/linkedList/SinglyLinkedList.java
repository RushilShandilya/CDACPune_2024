package com.dsa.linkedList;

public class SinglyLinkedList implements LinkedList {
    public static Node head = null;
    @Override
    public void addAtFront(int element) {
        Node node = new Node(element);
        if(head!=null) node.next = head;
        head = node;
    }

    @Override
    public void addAtRear(int element) {
        if(head==null) head = new Node(element);
        else{
            Node temp = head;
            while(temp.next!=null) temp = temp.next;
            temp.next = new Node(element);
        }
    }

    @Override
    public Node deleteElement(int element) throws NullPointerException {
            if(head==null) throw new NullPointerException("Linked List is empty");
            if(head.value == element) return head.next;
            Node prev = null , current = head;
            while(current.value!=element){
                prev = current;
               current = current.next;
            }
            prev.next = current.next;
            return head;
    }

    @Override
    public Node deleteAllElement(int element) throws NullPointerException{
        if(head==null) throw new NullPointerException("Linked List is empty");
        Node newHead = null , dummy = null;
        while(head!=null){
            if(head.value!=element){
                if(newHead==null){
                    newHead = new Node(head.value);
                    dummy = newHead;
                }else{
                    dummy.next = new Node(head.value);
                    dummy = dummy.next;
                }
            }
            head=head.next;
        }
        return newHead;
    }

    @Override
    public boolean searchList(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.value==element) return true;
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
        Node temp = head;
        while(temp!=null){
            System.out.print("| " + temp.value + " |->");
            temp = temp.next;
        }
    }
}
