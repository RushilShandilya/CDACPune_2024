package com.dsa.queue.basicqueue;

public interface Queue {
    void enqueue(int insert);
    int dequeue();
    int peek();
    boolean isEmpty();
}
