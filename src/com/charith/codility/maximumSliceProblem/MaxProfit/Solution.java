package com.charith.codility.maximumSliceProblem.MaxProfit;

public class Solution {

    public int solution1(int[] A) {
        int maxProfit = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (maxProfit < A[j] - A[i]) {
                    maxProfit = A[j] - A[i];
                }
            }
        }
        return maxProfit;
    }

    public int solution(int[] A) {
        if(A.length == 1 || A.length==0){
            return 0;
        }
        int currentMaxProfit;
        int maxProfit = 0;
        int minimumSold = A[0];
        for (int i = 1; i < A.length; i++) {
            currentMaxProfit = Math.max(0, A[i] - minimumSold);
            minimumSold = Math.min(minimumSold, A[i]);
            maxProfit = Math.max(maxProfit, currentMaxProfit);
        }
        return maxProfit;
    }

}
