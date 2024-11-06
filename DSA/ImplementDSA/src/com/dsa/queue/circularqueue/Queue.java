package com.dsa.queue.circularqueue;

public interface Queue {
    void enqueue(int element);
    int dequeue() throws QueueException;
    int peek() throws QueueException;
    boolean isEmpty();
    void print();
}
