package com.dsa.stack;

import java.util.Scanner;

public class Menu {
    public static ResizeableStack stack = null;
    public static void showMenu(){
        System.out.println("Growable Size Operations");
        System.out.println("0. Initialise initial size of stack");
        System.out.println("1. Push elements into stack");
        System.out.println("2. Pop elements out of stack");
        System.out.println("3. Peek at the top of the stack");
        System.out.println("4. Visualise stack");
    }
    public static void chooseOption(Scanner sc) throws IndexOutOfBoundsException{
        System.out.println("Enter the operation you want to perform");
        switch(sc.nextInt()){
            case 0:{
                stack = stackCreation(sc);
                break;
            }
            case 1:{
                System.out.println(pushIntoStack(stack,sc));
                break;
            }
            case 2:{
                System.out.println("Element popped : " + popOutOfStack(stack));
                break;
            }
            case 3:{
                System.out.println("Element peeked : " + peekIntoStack(stack));
                break;
            }
            case 4:{
                System.out.println("----------------------------");
                visualiseStack(stack);
                System.out.println("----------------------------");
                break;
            }
        }
    }
    public static ResizeableStack stackCreation(Scanner sc){
        System.out.println("Enter the initial size of stack");
        return new ResizeableStack(sc.nextInt());
    }
    public static String pushIntoStack(ResizeableStack stack,Scanner sc){
        System.out.println("Enter the element you want?");
        int number;
        stack.push(number=(sc.nextInt()));
        return number+" added successfully";
    }
    public static int popOutOfStack(ResizeableStack stack) throws IndexOutOfBoundsException{
        return stack.pop();
    }
    public static int peekIntoStack(ResizeableStack stack) throws IndexOutOfBoundsException{
        return stack.peek();
    }
    public static void visualiseStack(ResizeableStack stack){
        for(int i = 0 ; i<stack.array.length ; ++i) System.out.print("| " + stack.array[i] + " ");
        System.out.println();
    }
}
