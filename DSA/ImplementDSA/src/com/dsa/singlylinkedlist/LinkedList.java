package com.dsa.singlylinkedlist;

public interface LinkedList {
    void addToRear(int element);
    void addToFront(int element);
    void add(int element , int position);
    boolean isPresent(int element);
    Node deleteOnce(int element);
    Node deleteAll(int element);
    boolean isEmpty();
    int deleteFromFront();



    void print();
}
