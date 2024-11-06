package com.dsa.binarytree;

public class Main {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);

        tree.addToLeft(BinaryTree.root,2);
        tree.addToRight(BinaryTree.root,3);

        tree.addToLeft(BinaryTree.root.left,4);
        tree.addToRight(BinaryTree.root.left,5);

        tree.printInOrder(BinaryTree.root);
        System.out.println();

        tree.printPreOrder(BinaryTree.root);
        System.out.println();

        tree.printPostOrder(BinaryTree.root);
    }
}
