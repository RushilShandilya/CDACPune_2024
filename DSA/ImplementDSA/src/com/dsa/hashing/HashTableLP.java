package com.dsa.hashing;

public class HashTableLP implements HashTable{
    private int size;
    private double loadFactor;
    private Integer[] buckets;
    private int keysCount;

    public HashTableLP(){
        size = 5;
        loadFactor = 0.75;
        buckets = new Integer[size];
        keysCount = 0;
    }

    private int modN(int element){ return element%size; }

    private void resizeHashTable(){
        size*=2;
        Integer[] oldValues = buckets;
        buckets = new Integer[size];

        for(int i = 0 ; i<oldValues.length ; ++i){
            buckets[i] = oldValues[i];
        }
    }

    private void insertIntoBucket(Integer[] buckets,int index,int element){
        buckets[index] = element;
        ++keysCount;
        System.out.println(element + " inserted into " + index);
    }


    @Override
    public void insert(int element){

        if(keysCount>=(size*loadFactor)) resizeHashTable();

        int index = modN(element);

        if(buckets[index]==null){
            insertIntoBucket(buckets,index,element);
            return ;
        }

        //Linear Probing
        int i = (index+1)%size;
        int count = 1;

        while(count<size){
            if(buckets[i]==null){
                insertIntoBucket(buckets,i,element);
                return ;
            }
            ++count;
            i = (i+1)%size;
        }

    }

    private static boolean check(Integer[] buckets , int index , int element){
         return buckets[index]!=null && buckets[index]==element;
    }

    @Override
    public boolean search(int element) {
        int index = modN(element);

        if(check(buckets,index,element)) return true;

        int count = 1 , i = (index+1)%size;
        while(count<size){

            if(check(buckets,i,element)) return true;

            i = (i+1)%size;
            ++count;
        }

        return false;
    }
}
