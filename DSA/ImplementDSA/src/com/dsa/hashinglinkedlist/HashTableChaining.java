package com.dsa.hashinglinkedlist;

public class HashTableChaining implements HashTable{
    private final LinkedList[] buckets;
    private final int size;

    public HashTableChaining(){
        size = 5;
        buckets = new LinkedList[size];

        for(int i = 0 ; i<buckets.length; ++i) buckets[i] = new LinkedList();

    }

    private Integer modN(int element){
        return element%size;
    }

    @Override
    public void insert(int element) {
        Integer key = modN(element);

        if(buckets[key].isEmpty()){
            LinkedList list = new LinkedList();
            list.insert(element);
            buckets[key] = list;
        }else{
            LinkedList list = buckets[key];
            list.insert(element);
            buckets[key] = list;
        }
    }

    @Override
    public boolean search(int element) {
        int key = modN(element);
        if(buckets[key]!=null){
            LinkedList list = buckets[key];
            return list.search(element);
        }
        return false;
    }
}
