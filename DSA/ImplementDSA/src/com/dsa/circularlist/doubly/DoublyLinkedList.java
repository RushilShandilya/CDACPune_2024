package com.dsa.circularlist.doubly;

public class DoublyLinkedList implements LinkedList{
    public static Node head;
    public static Node tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void insertToFront(int element) {
        if(head==null){
            head = new Node(element);
            tail = head;
        }else{
            Node node = new Node(element);
            node.next = head;
            head.prev = node;
            head = node;
        }
        tail.next = head;
        head.prev = tail;
    }

    @Override
    public void insertToBack(int element) {
            if(head==null){
                head =  new Node(element);
                tail = head;
            }else{
                tail.next = new Node(element);
                tail.next.prev = tail;
                tail = tail.next;
            }
            tail.next = head;
            head.prev = tail;
    }

    @Override
    public void insertInBetween(int element, int position) {
        if(position<0) return ;
        else if(position==0) insertToFront(element);
        else{
            int count = 1;
            Node temp = head , node = new Node(element);
            while(count<position) {
                temp = temp.next;
                ++count;
            }

            node.next = temp.next;
            temp.next = node;
            node.next.prev = node;
            node.prev = temp;

            temp = null;
        }
        tail.next = head;
        head.prev = tail;
    }

    @Override
    public int deleteFromFront() throws LinkedListException {
        if(isEmpty()) throw new LinkedListException("LinkedList is Empty");
        else{
            int x = head.value;
            if(head==tail){
                head = null;
                tail = null;

                return x;
            }
            Node temp = head;
            head = head.next;

            temp.next.prev = null;
            temp.next = null;

            head.prev = tail;
            tail.next = head;

            return x;
        }
    }

    @Override
    public int deleteFromBack() throws LinkedListException {
        if(!isEmpty()){
            int x = tail.value;

            if(head==tail){
                head = null;
                tail = null;

                return x;
            }

            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;

            head.prev = tail;
            tail.next = head;

            return x;
        }else throw new LinkedListException("LinkedList is empty");
    }

    @Override
    public int deleteAtPosition(int position) throws LinkedListException {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    public void print(){
        Node temp = head;
        do{
            System.out.print(temp.value + " ");
            temp = temp.next;
        }while(temp!=head);
    }
}
