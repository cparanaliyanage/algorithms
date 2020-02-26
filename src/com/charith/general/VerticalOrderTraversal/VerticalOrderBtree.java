package com.charith.general.VerticalOrderTraversal;

// Java program for printing vertical order of a given binary tree

public class VerticalOrderBtree {
    // Tree node
    static class Node {
        int key;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            key = data;
            left = null;
            right = null;
        }
    }


    // The main function to print vertical order of a binary tree
    // with the given root
    static void printVerticalOrder(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            printVerticalOrder(root.left);
        }
        System.out.println(root.key);
        if (root.right != null) {
            printVerticalOrder(root.right);
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {

        // TO DO Auto-generated method stub
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
    }
}
// This code is contributed by Sumit Ghosh
