package com.charith.codility.MinMaxDivision;

public class Solution {

    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int[] sum = new int[A.length + 1];
        for (int i = 1; i < A.length; i++) {
            sum[i] = sum[i - 1] + A[i];
        }
        int[] index = new int[K-1];
        return 0;
    }

}
