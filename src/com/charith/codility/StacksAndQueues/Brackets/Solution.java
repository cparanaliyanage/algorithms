package com.charith.codility.StacksAndQueues.Brackets;

import java.util.Stack;

public class Solution {

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character character : S.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
                System.out.println(stack);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                Character popedCharacter = stack.pop();
                System.out.println(stack);
                if (!((popedCharacter == '(' && character == ')')
                        || (popedCharacter == '{' && character == '}')
                        || (popedCharacter == '[' && character == ']'))) {
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
