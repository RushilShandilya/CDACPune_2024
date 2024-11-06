package com.dsa.binarytree;

public interface Tree {
    void addToLeft(Node node , int element);
    void addToRight(Node node , int element);
    void printInOrder(Node node);
    void printPreOrder(Node node);
    void printPostOrder(Node node);
}
