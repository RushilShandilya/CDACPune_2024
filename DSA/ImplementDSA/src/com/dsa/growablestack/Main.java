package com.dsa.growablestack;

public class Main {
    public static void main(String[] args){
        GrowableStack stack = new GrowableStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        stack.pop();

        stack.print();
    }
}
