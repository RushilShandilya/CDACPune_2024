package com.dsa.doublylinkedlist;

public interface LinkedList {
    void addToRear(int element);
    void addToFront(int element);
    boolean isPresent(int element);
    Node deleteOnce(int element);
    Node deleteAll(int element);
    boolean isEmpty();
    int deleteFromFront();

    void print();
}
