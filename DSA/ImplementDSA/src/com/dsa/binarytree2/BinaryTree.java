package com.dsa.binarytree2;

public class BinaryTree {
    public static Node root;
    public static int index=-1;
    public BinaryTree(){
        root=null;
    }
    public static Node createTree(int[] values){
        ++index;
        if(index>=values.length || values[index]==-1) return null;

        Node node = new Node(values[index]);

        node.left = createTree(values);
        node.right = createTree(values);

        return node;
    }
    public static void traverseTree(Node root){
        if(root==null) return ;

        traverseTree(root.left);
        System.out.print(root.value + " ");
        traverseTree(root.right);
    }
    public static int heightOfTree(Node root){
        if(root==null) return 0;

        int a = heightOfTree(root.left)+1;
        int b = heightOfTree(root.right)+1;

        return Math.max(a,b);
    }
    public static void main(String[] args){
        Node root = createTree(new int[]{1,2,3,4,-1,-1,5,6});
        traverseTree(root);
        int height = heightOfTree(root);
        System.out.println();
        System.out.println(height);
    }
}
