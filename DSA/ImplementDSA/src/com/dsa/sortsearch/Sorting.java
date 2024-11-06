package com.dsa.sortsearch;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.stream.IntStream;

public class Sorting {
    public static void bubbleSort(int[] array){
        long before = System.nanoTime();
        for(int i = 0 ; i<array.length ; ++i){
            for(int j = i ; j<array.length ; ++j){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        long after = System.nanoTime();
        System.out.println("Bubble Sort Time Difference : " + (after-before));

        for(int i : array) System.out.print(i + " ");
        System.out.println();
    }
    public static void insertionSort(int[] array){
        long before = System.nanoTime();
        for(int i = 1 ; i<array.length ; ++i){
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;

                --j;
            }
        }
        long after = System.nanoTime();
        System.out.println("Insertion Sort Time Difference : " + (after-before));

        for(int i : array) System.out.print(i + " ");
        System.out.println();
    }
    // 8 9 2 1 0
    public static void insertionSortDifferent(int[] array){
        long before = System.nanoTime();
        for(int i = 1 ; i<array.length ; ){
            int j = i;
            while((j>0 && j<array.length) && array[j-1]<array[j]) {++j;}
            if(j==array.length) {

                long after = System.nanoTime();
                System.out.println("Time difference Insertion sort(my way) : " + (after-before));

                for(int x : array) System.out.print(x + " ");
                System.out.println();
                return;
            }
            //i=j;
            int x = array[j];
            while(j>0 && x<array[j-1]){
                array[j] = array[j-1];
                --j;
            }
            array[j] = x;
        }

//        for(int i : array) System.out.print(i + " ");
//        System.out.println();
    }
    public static boolean isArraySorted(int[] array){
        for(int i = 1 ; i<array.length ; ++i){
            int j = i;
            while((j>0 && j<array.length) && (array[j-1]<array[j])) ++j;
            if(i==1 && j==array.length) return true;
        }
        return false;
    }
    public static void main(String[] args){
        //bubbleSort(IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray());
        //insertionSort(IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray());
        //insertionSortDifferent(IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray());

        int[] testerArray = new int[]{1,2,3,4,100,99,98,97,96,95,10,5};

//        bubbleSort(testerArray);
//        insertionSort(testerArray);
//        insertionSortDifferent(testerArray);

        //System.out.println(isArraySorted(new int[]{1,2,3,4,5,6,7,8,9,10}));
        //System.out.println(isArraySorted(new int[]{0,0,0,0,0,0}));
        //System.out.println(isArraySorted(new int[]{10,9,8,7,6,5,4,3,2,1}));
        //System.out.println(isArraySorted(new int[]{1,23,21,5,4,2,3,6,8}));
    }
}
