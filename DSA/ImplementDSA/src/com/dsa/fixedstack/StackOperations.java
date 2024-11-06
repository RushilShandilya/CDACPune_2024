package com.dsa.fixedstack;

public interface StackOperations {
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
    void print();
}
