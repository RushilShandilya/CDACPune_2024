package com.dsa.hashing;

public class BinarySearchTree {
    private Node root;
    public BinarySearchTree(){
        root=null;
    }
    public Node getNode(){
        return root;
    }
    public void setNode(Node root){
        this.root = root;
    }
    public Node addToTree(Node node , int element){
        if(node==null) return new Node(element);
        else if(element<node.value) node.left = addToTree(node.left,element);
        else node.right = addToTree(node.right,element);

        return node;
    }
    public boolean isEmpty(Node root){
        return root==null;
    }

    public boolean searchElement(Node node,int element){
            if(node==null) return false;
            else if(node.value==element) return true;
            else if(element<node.value) return searchElement(node.left,element);
            else return searchElement(node.right,element);
    }
}
