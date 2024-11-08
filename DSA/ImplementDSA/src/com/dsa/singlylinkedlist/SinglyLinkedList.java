package com.dsa.singlylinkedlist;

public class SinglyLinkedList implements LinkedList{
    public static Node head;
    public static Node tail;

    public SinglyLinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void addToRear(int element) {
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
    public void addToFront(int element) {
        Node node = new Node(element);
        if(head!=null) {
            node.next = head;
        }
        if(head==null) tail = node;
        head = node;
    }

    @Override
    public void add(int element, int position) {
        if(position<0) return ;
        if(position==0) addToFront(element);
        else{
            int count = 1;
            Node temp = head , prev = null;
            while(count<=position){
                prev = temp;
                temp = temp.next;
                ++count;
            }
           Node node = new Node(element);
           assert prev != null;
           prev.next = node;
           node.next = temp;
        }
    }

    @Override
    public boolean isPresent(int element) {
        Node temp = head;
        while(temp!=null){
            if(temp.value == element) return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Node deleteOnce(int element) {
        Node temp = head;
        if(head.value==element) return head.next;
        while(temp!=null){
            if(temp.next.value == element){
                Node temp2 = temp.next;
                temp.next = temp2.next;
            }
            temp = temp.next;
        }
        return head;
    }

    @Override
    public Node deleteAll(int element) {
        Node dummy = null , newHead = null;
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
            head = head.next;
        }
        return newHead;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int deleteFromFront() throws IndexOutOfBoundsException {
        if(!isEmpty()){
          int value = head.value;
          head = head.next;
          return value;
        }else throw new IndexOutOfBoundsException("Stack is Empty");
    }

    @Override
    public void print() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node reverseList(Node head){
        if(head==null || head.next==null) return head;

        Node node = reverseList(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return node;
    }
}
