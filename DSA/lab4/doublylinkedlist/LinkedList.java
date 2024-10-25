package com.dsa.doublylinkedlist;

public interface LinkedList {
    void addAtFront(int element);
    void addAtRear(int element);
    Node deleteFirstNode();
    Node deleteElement(int element);
    Node deleteAllElement(int element);
    boolean searchList(int element);
    boolean isListEmpty();
    void print();
}
