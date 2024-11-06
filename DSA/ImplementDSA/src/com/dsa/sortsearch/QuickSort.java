package com.dsa.sortsearch;

public class QuickSort {
    public static int getPartitionIndex(int[] array , int low , int high){
        int pivot = array[low] , i = low , j = high;
        while(i<j){
            while(array[i]<=pivot && i<high) ++i;
            while(array[j]>pivot && j>low) --j;
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;
    }
    public static void quickSort(int[] array , int low , int high){
        if(low>=high) return ;
        int partitionIndex = getPartitionIndex(array,low,high);
        quickSort(array,low,partitionIndex-1);
        quickSort(array,partitionIndex+1,high);
    }
    public static void main(String[] args){
        int[] array = new int[]{5,4,3,2,1};
        quickSort(array,0,array.length-1);
        for(int x : array) System.out.print(x + " ");
    }
}
