package com.dsa.circularlist.doubly;

public interface LinkedList {
    void insertToFront(int element);
    void insertToBack(int element);
    void insertInBetween(int element, int position);
    int deleteFromFront() throws LinkedListException;
    int deleteFromBack() throws LinkedListException;
    int deleteAtPosition(int element) throws LinkedListException;
    boolean isEmpty();
}
