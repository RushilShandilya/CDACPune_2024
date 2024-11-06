package com.dsa.hashing;

public class HashTableTesting {
    public static void main(String[] args){
        Integer[] elementsToEnter = new Integer[]{10,5,15,11,1,21};
        //HashTableLP hashTable = new HashTableLP();

        HashTableUsingChaining hashTable = new HashTableUsingChaining();

        for(int element : elementsToEnter){
            hashTable.insert(element);
        }

        hashTable.printAll(hashTable.getHashTable());

        Integer[] elementsToSearch = new Integer[]{15,12,11,10,46,75};
        for(int element : elementsToSearch){
            System.out.println(hashTable.search(element));
        }
    }
}
