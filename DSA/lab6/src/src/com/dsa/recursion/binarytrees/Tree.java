package com.dsa.recursion.binarytrees;

public interface Tree {
    void createRootNode(int element);
    void addToLeft(int element,Node currentNode);
    void addToRight(int element,Node currentNode);
    void delete(int element);
    boolean isPresent(int element);
    void printPreOrder(Node root);
    void printPostOrder(Node root);
    void printInOrder(Node root);
    int countNode(Node root);
    int countLeafNode(Node root);
    int countNodesWithValue(Node root , int value);
}
