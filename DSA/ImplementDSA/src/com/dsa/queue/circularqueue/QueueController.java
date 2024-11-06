package com.dsa.queue.circularqueue;
public class QueueController {
    public static void main(String[] args){
        try{
            CircularQueue queue = new CircularQueue(5);
            int[] values = {10,20,30,40,50};
            for(int x : values) queue.enqueue(x);
            queue.enqueue(60);
            queue.print();

            System.out.println();
            queue.dequeue();

            queue.enqueue(80);

            System.out.println();
            queue.print();

            while(!queue.isEmpty()){
                System.out.print(queue.dequeue() + " ");
            }

        }catch(QueueException e){
            System.out.println("Exception message : " + e.getMessage());
        }
    }
}
