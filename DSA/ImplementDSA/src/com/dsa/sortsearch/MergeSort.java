package com.dsa.sortsearch;

import java.util.ArrayList;
import java.util.List;

public class MergeSort{
    public static void merge(int[] array , int low , int mid , int high){
        int left = low;
        int right = mid+1;

        List<Integer> list = new ArrayList<>();
        while(left<=mid && right<=high){
            if(array[left]<=array[right]){
                list.add(array[left]);
                ++left;
            }else{
                list.add(array[right]);
                ++right;
            }
        }

        while(left<=mid){
            list.add(array[left]);
            ++left;
        }
        while(right<=high){
            list.add(array[right]);
            ++right;
        }

        for(int i = low ; i<=high ; ++i){
            array[i] = list.get(i-low);
        }

    }
    public static void mergeSort(int[] array , int low , int high){

        if(low>=high) return ;
        int mid = low + (high-low)/2;

        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void main(String[] args){
        int[] values = new int[]{10,9,8,7,6,5};
        mergeSort(values,0,values.length-1);

        for(int i : values) System.out.print(i + " ");
    }
}