package com.charith.codility.timecomplexity.tapeequilibrium;

public class Solution {

    public int solution(int[] A) {
        int rightSum = 0;
        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }
        // Performance failed when I write the code using streams
        int leftSum = 0;
        int minimumDifferent = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            minimumDifferent = Math.min(minimumDifferent, Math.abs(leftSum - rightSum));
        }
        return minimumDifferent;
    }
}
