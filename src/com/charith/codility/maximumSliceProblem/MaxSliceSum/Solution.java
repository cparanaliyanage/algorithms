package com.charith.codility.maximumSliceProblem.MaxSliceSum;

public class Solution {

    public static int solution(int[] A) {
        int maximumSum = A[0];
        int consecutiveMaximum = A[0];
        for (int i = 1; i < A.length; i++) {
            // TODO something is wrong with this code copared to the below one. What is that issue?
            if (consecutiveMaximum < Math.max(consecutiveMaximum + A[i], A[i])) {
                consecutiveMaximum = Math.max(consecutiveMaximum + A[i], A[i]);
            } else {
                consecutiveMaximum = A[i];
            }
            maximumSum = Math.max(consecutiveMaximum, maximumSum);
        }
        return maximumSum;
    }

    public static int solution1(int[] A) {
        int maximumSum = A[0];
        int consecutiveMaximum = A[0];
        for (int i = 1; i < A.length; i++) {
            consecutiveMaximum = Math.max(consecutiveMaximum + A[i], A[i]);
            maximumSum = Math.max(consecutiveMaximum, maximumSum);
        }
        return maximumSum;
    }

}
