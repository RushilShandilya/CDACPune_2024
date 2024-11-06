package com.dsa.binarytree;

public class BinaryTree implements Tree{
    public static Node root;
    public BinaryTree(){
        root=null;
    }
    public BinaryTree(int element){
        root = new Node(element);
    }
    @Override
    public void addToLeft(Node node, int element) {
        if(node.left==null) node.left = new Node(element);
    }

    @Override
    public void addToRight(Node node, int element) {
        if(node.right==null) node.right = new Node(element);
    }

    @Override
    public void printInOrder(Node node) {
        if(node==null) return ;

        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    @Override
    public void printPreOrder(Node node) {
        if(node==null) return ;

        System.out.print(node.value + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    @Override
    public void printPostOrder(Node node) {
        if(node==null) return ;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value + " ");
    }
}
