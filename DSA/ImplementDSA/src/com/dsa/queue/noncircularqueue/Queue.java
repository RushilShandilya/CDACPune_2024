package com.dsa.queue.noncircularqueue;

public interface Queue {
    void enqueue(int element);
    int dequeue();
    boolean isEmpty();
    int peek();
}
