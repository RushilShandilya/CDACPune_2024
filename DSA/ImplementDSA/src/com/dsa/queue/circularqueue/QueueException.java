package com.dsa.queue.circularqueue;

public class QueueException extends Exception {
    public QueueException(String queueIsEmpty) {
        super(queueIsEmpty);
    }
}
