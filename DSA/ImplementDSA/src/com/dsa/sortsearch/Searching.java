package com.dsa.sortsearch;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Searching {
    public static boolean findUsingLinearSearch(int[] array, int element){
        for(int i : array) if(i==element) return true;
        return false;
    }
    public static boolean findUsingBinarySearch(int[] sortedArray, int element){
        int front = 0 , end = sortedArray.length-1;
        while(front<=end){
            int middle = end + (front-end)/2;
            if(sortedArray[middle]==element) return true;
            else if(sortedArray[middle]<element) front = middle+1;
            else end = middle-1;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(findUsingLinearSearch(IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray(),5));

        int[] sortedArray = Arrays.stream(IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray()).sorted().toArray();
        System.out.println(findUsingBinarySearch(sortedArray,5));



    }
}
