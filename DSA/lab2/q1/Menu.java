package com.dsa.queue;

import java.util.Scanner;

public class Menu {
    public static FixedSizedQueue queue = null;
    public static void showMenu(){
        System.out.println("Queue Operations");
        System.out.println("0. Initialise queue of fixed size");
        System.out.println("1. Check if queue is Empty");
        System.out.println("2. Check if queue is Full");
        System.out.println("3. Add to queue");
        System.out.println("4. Pop element out of queue");
        System.out.println("5. Peek the queue");
        System.out.println("6. Visualise Queue");
    }
    public static void chooseOption(Scanner sc) throws IndexOutOfBoundsException {
        System.out.println("Enter the operation you want to perform");
        switch (sc.nextInt()) {
            case 0: {
                queue = queueCreation(sc);
                break;
            }
            case 1: {
                System.out.println("Is Queue Empty? : " + checkIfQueueIsEmpty(queue));
                break;
            }
            case 2: {
                System.out.println("Is Queue Full? : " + checkIfQueueIsFull(queue));
                break;
            }
            case 3: {
                System.out.println("Status : " + addToQueue(queue,sc));
                break;
            }
            case 4: {
                System.out.println("Element dequeue : " + removeFromQueue(queue));
                break;
            }
            case 5: {
                System.out.println("Peek at front : " + peekFromQueue(queue));
                break;
            }
            case 6:{
                System.out.println("---------------------------");
                printElementsInQueue(queue);
                System.out.println("---------------------------");
                break;
            }
        }
    }
    public static FixedSizedQueue queueCreation(Scanner sc){
        System.out.println("Enter the size of queue");
        return new FixedSizedQueue(sc.nextInt());
    }
    public static boolean checkIfQueueIsEmpty(FixedSizedQueue queue){
        return queue.isEmpty();
    }
    public static boolean checkIfQueueIsFull(FixedSizedQueue queue){
        return queue.isFull();
    }
    public static String addToQueue(FixedSizedQueue queue,Scanner sc) throws IndexOutOfBoundsException{
        System.out.println("Enter the element you want to enter");
        int number;
        queue.enqueue(number=sc.nextInt());
        return number+" added successfully";
    }
    public static int removeFromQueue(FixedSizedQueue queue) throws IndexOutOfBoundsException{
        return queue.dequeue();
    }
    public static int peekFromQueue(FixedSizedQueue queue) throws IndexOutOfBoundsException{
        return queue.peek();
    }
    public static void printElementsInQueue(FixedSizedQueue queue){
        int front = queue.front , back = queue.back;
        if(front==-1) front++;
        if(back==queue.queue.length) back--;
        for(int i = front ; i<=back ; ++i){
            System.out.print(queue.queue[i]+" | ");
        }
        System.out.println();
    }
}
