package com.dsa.stack;

public class ResizeableStack implements Stack{
    int[] array;
    int top;

    public ResizeableStack(){}

    public ResizeableStack(int n){
        array = new int[n];
        top = -1;
    }
    @Override
    public void push(int element) {
        ++top;
        if (top == array.length) array = resizeArray(this.array.length);
        array[top] = element;
    }

    @Override
    public int pop() throws IndexOutOfBoundsException{
        if(!isEmpty()){
             int topElement = array[top];
             top--;
             return topElement;
        }else throw new IndexOutOfBoundsException("Stack is empty");
    }

    @Override
    public int peek() throws IndexOutOfBoundsException{
        if(!isEmpty()) return array[top];
        else throw new IndexOutOfBoundsException("Stack is Empty");
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    private int[] resizeArray(int n){
        int[] tempArray = new int[2*n];
        if (n >= 0) System.arraycopy(array, 0, tempArray, 0, n);
        return tempArray;
    }
}
