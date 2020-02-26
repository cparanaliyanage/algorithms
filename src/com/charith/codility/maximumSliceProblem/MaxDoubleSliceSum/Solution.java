package com.charith.codility.maximumSliceProblem.MaxDoubleSliceSum;

public class Solution {

    public static int solution(int[] A) {
        int[] forwardSum = new int[A.length];
        for (int i = 1; i < A.length; i++) {
            forwardSum[i] = Math.max(forwardSum[i - 1] + A[i], 0);
        }

        int[] backwardSum = new int[A.length];
        for (int i = A.length - 2; i >= 0; i--) {
            backwardSum[i] = Math.max(backwardSum[i + 1] + A[i], 0);
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            maxSum = Math.max(forwardSum[i - 1] + backwardSum[i + 1], maxSum);
        }
        return maxSum;
    }

}
