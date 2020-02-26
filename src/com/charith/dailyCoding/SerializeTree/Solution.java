package com.charith.dailyCoding.SerializeTree;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String serializedString = serialize(new Node("root",
                new Node("left", new Node("left.left")),
                new Node("right")));
        System.out.println(serializedString);
        deserialize(serializedString);
    }

    public static String serialize(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.isEmpty()) {
            Node topNode = stack.pop();
            if (topNode != null) {
                stringBuffer.append(topNode.value).append(",");
                stack.push(topNode.right);
                stack.push(topNode.left);
            } else {
                stringBuffer.append("#,");
            }
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
    }

    public static Node deserialize(String serializedString) {
        String[] splittedStrings = serializedString.split("\\{");
        return new Node("root", null, null);
    }
}

class Node {

    String value;
    Node left;
    Node right;

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(String value) {
        this(value, null);
    }

    public Node(String value, Node left) {
        this(value, left, null);
    }

}
