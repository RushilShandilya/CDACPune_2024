package com.dsa.binarytree;

public class Main {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree(1);

        binaryTree.addToLeft(BinaryTree.root,2);
        binaryTree.addToRight(BinaryTree.root,3);

        binaryTree.addToLeft(BinaryTree.root.right,4);
        binaryTree.addToRight(BinaryTree.root.right,5);

        binaryTree.printInOrder(BinaryTree.root);
    }
}
