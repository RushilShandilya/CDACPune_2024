package com.dsa.fixedstack;

public class Main{
    public static void main(String[] args){
        FixedSizeStack stack = new FixedSizeStack(5);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        stack.print();

        stack.pop();

        stack.print();
    }
}
