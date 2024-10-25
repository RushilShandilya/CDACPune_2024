package com.dsa.recursion.binarytrees;

public class BinaryTree implements Tree {
    public static Node root;
    //public static int countNode = 0;

    public BinaryTree() {
        root = null;
    }

    @Override
    public void createRootNode(int element) {
        if (root == null) root = new Node(element);
    }

    @Override
    public void addToLeft(int element, Node currentNode) {
        if (currentNode.left == null) currentNode.left = new Node(element);
        else addToLeft(element, currentNode.left);
    }

    @Override
    public void addToRight(int element, Node currentNode) {
        if (currentNode.right == null) currentNode.right = new Node(element);
        else addToRight(element, currentNode.right);

    }

    @Override
    public void delete(int element) {

    }

    @Override
    public boolean isPresent(int element) {
        return false;
    }

    @Override
    public void printPreOrder(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    @Override
    public void printPostOrder(Node root) {
        if (root == null) return;
        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.value + " ");
    }

    @Override
    public void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }

    @Override
    public int countNode(Node root) {
        if (root == null) return 0;
        int a = countNode(root.left);
        int b = countNode(root.right);
        return a + b + 1;
    }

    @Override
    public int countLeafNode(Node root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        int a = countLeafNode(root.left);
        int b = countLeafNode(root.right);

        return a+b;
    }

    @Override
    public int countNodesWithValue(Node root, int value) {
        //nodeCounter(root,value);
        if(root==null) return 0;
        if(root.value == value)
            return countNodesWithValue(root.left,value) + countNodesWithValue(root.right,value)+1;

        return countNodesWithValue(root.left,value) + countNodesWithValue(root.right,value);
    }
//    public void nodeCounter(Node root, int value){
//        if(root==null) return ;
//        if(root.value == value) ++countNode;
//
//        nodeCounter(root.left,value);
//        nodeCounter(root.right,value);
//    }
}
