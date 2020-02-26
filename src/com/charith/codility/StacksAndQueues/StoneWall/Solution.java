package com.charith.codility.StacksAndQueues.StoneWall;

import java.util.Stack;

public class Solution {

    public int solution(int[] H) {
        Stack<Integer> heights = new Stack<>();
        int numberOfBlocks = 0;

        for (int i = 0; i < H.length; i++) {
            if(!heights.isEmpty() && heights.peek()> H[i]){

            } else {
                heights.push(H[i]);
            }
        }
        return numberOfBlocks;
    }

}
