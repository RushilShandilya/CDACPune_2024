package com.dsa.hashinglinkedlist;

public class HashTableOperations{
    public static void main(String[] args){
        HashTableChaining hashTable = new HashTableChaining();
        Integer[] insert = {10,11,12,20,21,22};
        for(int x : insert) hashTable.insert(x);

        Integer[] search = {15,10,11,23,25,22,21};
        for(int x : search) System.out.println(hashTable.search(x));
    }
}
