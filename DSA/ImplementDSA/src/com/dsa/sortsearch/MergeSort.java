package com.dsa.sortsearch;

import java.util.ArrayList;
import java.util.List;

public class MergeSort{
    public static void merge(int[] array , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low , right = mid+1;

        while(left<=mid && right<=high){
            if(array[left]<=array[right]){
                temp.add(array[left]);
                ++left;
            }else{
                temp.add(array[right]);
                ++right;
            }
        }

        while(left<=mid){
            temp.add(array[left]);
            ++left;
        }
        while(right<=high){
            temp.add(array[right]);
            ++right;
        }
        for(int i = low ; i<=high ; ++i) array[i] = temp.get(i-low);
    }
    public static void mergeSort(int[] array , int low , int high){
        if(low>=high) return ;
        int mid = low + (high-low)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void main(String[] args){
        int[] array = new int[]{10,9,8,7,6,5};
        mergeSort(array,0,array.length-1);
        for(int x : array) System.out.print(x + " ");
    }
}