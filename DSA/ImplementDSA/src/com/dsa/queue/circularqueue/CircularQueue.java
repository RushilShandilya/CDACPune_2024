package com.dsa.queue.circularqueue;

public class CircularQueue implements Queue{
    private int[] queue;
    int front , back;
    public CircularQueue(int size){
        front = back = -1;
        queue = new int[size];
    }
    void resize(){
        int size = 2*queue.length;
        int[] oldQueue = queue;
        queue = new int[size];
        System.arraycopy(oldQueue, 0, queue, 0, oldQueue.length);
    }
    boolean isFull(){
        return (back+1)%queue.length==front;
    }
    @Override
    public void enqueue(int element) {
        if(isEmpty()) ++front;
        else if(isFull()) {
            System.out.println("Resizing Queue");
            resize();
        }
        back = (back+1)%queue.length;
        queue[back] = element;
    }

    @Override
    public int dequeue() throws QueueException {
        if(!isEmpty()){
            int x = queue[front];
            front = (front+1)%queue.length;
            return x;
        }else throw new QueueException("Queue is empty");
    }

    @Override
    public int peek() throws QueueException{
        if(!isEmpty()){
            return queue[front];
        }else throw new QueueException("Queue is empty");
    }

    @Override
    public boolean isEmpty() {
        return front==-1;
    }

    @Override
    public void print() {
        for(int x : queue) System.out.print("|"+x+"| ");
        System.out.println();
    }
}
