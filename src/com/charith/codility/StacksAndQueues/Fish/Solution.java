package com.charith.codility.StacksAndQueues.Fish;

import java.util.Stack;

public class Solution {

    public static int solution(int[] A, int[] B) {
        Stack<Integer> downStreamFish = new Stack<>();
        int liveFish = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downStreamFish.push(A[i]);
                liveFish++;
            } else {
                while (true) {
                    if (!downStreamFish.isEmpty()) {
                        int alreadyAddedFish = downStreamFish.pop();
                        if (alreadyAddedFish > A[i]) {
                            downStreamFish.push(alreadyAddedFish);
                            break;
                        } else {
                            liveFish--;
                        }
                    } else {
                        liveFish++;
                        break;
                    }
                }
            }
        }
        return liveFish;
    }
}
