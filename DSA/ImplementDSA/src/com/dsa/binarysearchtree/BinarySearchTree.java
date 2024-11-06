package com.dsa.binarysearchtree;

public class BinarySearchTree {
    public static Node createTree(Node node,int[] values , int index){
        if(node==null) return new Node(values[index]);
        else if(values[index]<=node.value) node.left = createTree(node.left,values,index);
        else node.right = createTree(node.right,values,index);

        return node;
    }
    public static void inOrder(Node node){
        if(node==null) return ;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    public static int findSmallest(Node node){
        if(node.left==null) return node.value;
        return findSmallest(node.left);
    }
    public static int findLargest(Node node){
        if(node.right==null) return node.value;
        return findLargest(node.right);
    }
    public static void delete(Node root , int element){
        if(root==null) return ;



    }
    public static void main(String[] args){
        Node root=null;
        int[] values = new int[]{5,1,2,3,6,7};
        for(int i = 0 ; i<values.length ; ++i) root = createTree(root,values,i);

        inOrder(root);

        System.out.println();
        System.out.println(findSmallest(root));
        System.out.println(findLargest(root));

    }
}
