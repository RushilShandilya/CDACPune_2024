package com.dsa.fixedstack;

public class FixedSizeStack implements StackOperations{
    int[] stack;
    int size;
    int top = -1;

    public FixedSizeStack(int size){
        this.size = size;
        stack = new int[size];
    }

    @Override
    public void push(int element) {
        if(!isFull()) {
            ++top;
            stack[top] = element;
        }else throw new IndexOutOfBoundsException("Stack is full");
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int element = stack[top];
            --top;
            return element;
        }else throw new IndexOutOfBoundsException("Stack is empty");
    }

    @Override
    public int peek() {
        if(!isEmpty()) return stack[top];
        else throw new IndexOutOfBoundsException("Stack is empty");
    }

    @Override
    public boolean isEmpty(){
        return top==-1;
    }
    @Override
    public boolean isFull(){
        return top>=stack.length;
    }
    @Override
    public void print(){
        for(int i : stack) System.out.print(i + " | ");
        System.out.println();
    }
}
