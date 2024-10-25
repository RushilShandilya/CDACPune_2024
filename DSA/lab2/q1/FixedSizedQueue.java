package com.dsa.queue;

public class FixedSizedQueue implements Queue{
    int[] queue;
    int front,back;

    public FixedSizedQueue(){

    }
    public FixedSizedQueue(int n){
        queue = new int[n];
        front = -1;
        back = -1;
    }

    @Override
    public void enqueue(int element) throws IndexOutOfBoundsException{
        ++back;
        if(!isFull()){
            queue[back] = element;
        }else {
            --back;
            throw new IndexOutOfBoundsException("Queue is full");
        }
    }

    @Override
    public int dequeue() throws IndexOutOfBoundsException{
        if(!isEmpty()) {
            ++front;
            int element = queue[front];
            for(int i = front+1 ; i<=back ; ++i) {
                queue[i-1] = queue[i];
            }
            --back;
            //Pushing elements back
            return element;
        }else throw new IndexOutOfBoundsException("Queue is Empty");
    }

    @Override
    public int peek() {
        int temp = -1;
        if(front==-1) temp = front+1;
        else temp = front;
        if(!isEmpty()) return queue[temp];
        else throw new IndexOutOfBoundsException("The Queue is Empty");
    }

    @Override
    public boolean isFull() {
        return back==queue.length;
    }

    @Override
    public boolean isEmpty(){
        if(front==-1 && back==-1) return true;
        return front>back;
    }
}
