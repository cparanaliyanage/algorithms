package com.charith.codility.StacksAndQueues.Nesting;

import java.util.Stack;

public class Solution {

    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character character : S.toCharArray()) {
            if (character == '(') {
                stack.push(character);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
