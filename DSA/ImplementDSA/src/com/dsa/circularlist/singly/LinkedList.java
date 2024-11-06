package com.dsa.circularlist.singly;

public interface LinkedList {
    void addToFront(int element);
    void addToRear(int element);
    Node deleteOnce(int element);
    Node deleteAll(int element);
    boolean isEmpty();
    boolean isPresent(int element);
    void print();
}
