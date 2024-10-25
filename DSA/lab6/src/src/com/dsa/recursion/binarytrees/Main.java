package com.dsa.recursion.binarytrees;

public class Main {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.createRootNode(10);

        tree.addToLeft(20,BinaryTree.root);
        tree.addToRight(30,BinaryTree.root);
        tree.addToLeft(40,BinaryTree.root);

        tree.addToLeft(10,BinaryTree.root);
        tree.addToRight(10,BinaryTree.root.left);

        tree.printPreOrder(BinaryTree.root);
        System.out.println();

        tree.printInOrder(BinaryTree.root);
        System.out.println();

        tree.printPostOrder(BinaryTree.root);
        System.out.println();

        System.out.println(tree.countNode(BinaryTree.root));
        System.out.println(tree.countLeafNode(BinaryTree.root));
        System.out.println(tree.countNodesWithValue(BinaryTree.root,10));

    }
}
