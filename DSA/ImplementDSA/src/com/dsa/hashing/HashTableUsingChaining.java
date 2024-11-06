package com.dsa.hashing;

public class HashTableUsingChaining implements HashTable{
    private final BinarySearchTree[] hashTable;
    private final int size;

    public HashTableUsingChaining(){
        size = 5;
        hashTable = new BinarySearchTree[size];
        for(int i = 0 ; i<hashTable.length ; ++i){
            BinarySearchTree tree = new BinarySearchTree();
            hashTable[i] = tree;
        }
    }

    public int modN(int element){
        return element%size;
    }
    public BinarySearchTree[] getHashTable(){
        return hashTable;
    }

    @Override
    public void insert(int element) {
        int index = modN(element);

        Node root = hashTable[index].getNode();

//        if ((root == null)) System.out.println("Adding to a new tree at index " + index + "  value " + element);
//        else System.out.println("Adding to a existing tree at index " + index + " value " + element);

//        hashTable[index].inOrder(hashTable[index].getNode());
//        System.out.println();

        //hashTable[index].addToTree(root,element);
        hashTable[index].setNode(hashTable[index].addToTree(root,element));
    }

    @Override
    public boolean search(int element) {
        int index = modN(element);
        return hashTable[index].searchElement(hashTable[index].getNode(),element);
    }

    public void print(Node node){
        if(node==null) return ;

        print(node.left);
        System.out.print(node.value + " ");
        print(node.right);
    }

    public void printAll(BinarySearchTree[] hashTable){
        for(BinarySearchTree table : hashTable){
             print(table.getNode());
            System.out.println();
        }
    }
}
