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

//        if(node.left!=null && node.right!=null) System.out.print("<-" + node.value + "->");
//        else if(node.left!=null) System.out.print("<-" + node.value);
//        else if(node.right!=null) System.out.print(node.value + "->");
//        else System.out.print(node.value);

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
    public static int findMin(Node node){
        while(node.left != null) node = node.left;
        return node.value;
    }
    public static int findMax(Node node){
        while(node.right!=null) node = node.right;
        return node.value;
    }
    public static Node delete(Node root , int element){
        if(root==null) return null;
        else if(element<root.value) root.left = delete(root.left,element);
        else if(element>root.value) root.right = delete(root.right,element);
        else{
                //Case 1 : Leaf Node;
               if(root.left==null && root.right==null) return null;
               //Case 2: One Child Node;
               else if(root.left==null || root.right==null) return (root.left==null)?root.right:root.left;
               //Case 3 : Two Child Node;
               //Find InOrder_Successor or InOrder_Predecessor
               else{
                   //InOrder_Successor -> Smallest greatest element from current root value;
                   //root.value = findMin(root.right);
                   //root.right = delete(root.right,root.value);

                   //InOrder_Predecessor -> Greatest smallest element from current root value;
                   root.value = findMax(root.left);
                   root.left = delete(root.left,root.value);
               }
        }
        return root;
    }
    public static void main(String[] args){
        Node root=null;
        int[] values = new int[]{5,1,2,3,6,7};
        for(int i = 0 ; i<values.length ; ++i) root = createTree(root,values,i);

        inOrder(root);

        System.out.println();
        System.out.println(findSmallest(root));
        System.out.println(findLargest(root));

        root = delete(root,5);
        inOrder(root);
    }
}
