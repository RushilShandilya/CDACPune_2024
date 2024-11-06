package com.dsa.growablestack;

import com.dsa.singlylinkedlist.Node;
import com.dsa.singlylinkedlist.SinglyLinkedList;

public class GrowableStack extends SinglyLinkedList implements Stack{
    SinglyLinkedList list;
    public GrowableStack(){
        list = new SinglyLinkedList();
    }

    @Override
    public void push(int element) {
        list.addToFront(element);
    }

    @Override
    public int pop() throws IndexOutOfBoundsException {
        if(!isEmpty()) return deleteFromFront();
        else throw new IndexOutOfBoundsException("Stack is Empty");
    }

    @Override
    public int peek() {
        if(!list.isEmpty()) {
            return 0;
        }else throw new IndexOutOfBoundsException("Stack is Empty");
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void print() {
        list.print();
    }
}
