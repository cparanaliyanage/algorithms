package com.charith.general.binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(10);
        tree.add(3);
        System.out.println(tree);

        System.out.println(tree.countLeafNodes());
    }

}

class Tree {
    Node root;
    int totalLevels;

    public void add(int value) {
        root = addNode(root, value, 0);
    }

    public Node addNode(Node currentNode, int value, int level) {
        if (currentNode == null) {
            currentNode = new Node(value, level + 1);
            totalLevels = currentNode.level;
        } else if (currentNode.value < value) {
            currentNode.right = addNode(currentNode.right, value, currentNode.level);
        } else {
            currentNode.left = addNode(currentNode.left, value, currentNode.level);
        }
        return currentNode;
    }

    public int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public String toString() {
        return "Tree is " + root;
    }
}

class Node {
    int value;
    Node left;
    Node right;
    int level;

    Node(int value, int level) {
        this.value = value;
        this.level = level;
    }

    public String toString() {
        String tab = " ";
        String newLine = "\n";
        String returnString = Stream.generate(() -> tab).limit(30).collect(Collectors.joining()) + value;
        if (left != null) {
            returnString += Stream.generate(() -> tab).limit(30 / (level + 1)).collect(Collectors.joining()) + left;
        }
        if (right != null) {
            returnString += Stream.generate(() -> tab).limit(60 / (level + 1)).collect(Collectors.joining()) + right;
        }
        return returnString + newLine;
    }


    // TODO this is to pring binary array - https://leetcode.com/problems/print-binary-tree/submissions/
    public List<List<String>> printTree(TreeNode root) {
        int treeHeight = getHeight(root);
        List<List<String>> treeList = new ArrayList<>();
        int numberOfNodes = (int)Math.pow(2 , treeHeight+1)-1;
        String[][] tree = new String[treeHeight][numberOfNodes];
        for (String[] treeLevelArray : tree) {
            Arrays.fill(treeLevelArray, "");
        }
        rowString(tree, root, 0, 0, treeHeight);
        for (String[] treeLevelArray : tree) {
            treeList.add(Arrays.asList(treeLevelArray));
        }
        return treeList;
    }

    private void rowString(String[][] tree, TreeNode node, int currentLevel, int low, int high) {
        if (node == null) {
            return;
        }
        tree[currentLevel][(low + high) / 2] = String.valueOf(node.val);
        rowString(tree, node.left, currentLevel + 1, low, (low + high) / 2);
        rowString(tree, node.right, currentLevel + 1, (low + high) / 2 + 1, high);
    }

    private int getHeight(TreeNode node) {
        if (node.left != null && node.right != null) {
            return 1 + Math.max(getHeight(node.left), getHeight(node.right));
        }
        if (node.left != null) {
            return getHeight(node.left) + 1;
        } else if (node.right != null) {
            return getHeight(node.right) + 1;
        } else {
            return 1;
        }
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}