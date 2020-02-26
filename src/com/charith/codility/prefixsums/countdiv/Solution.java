package com.charith.codility.prefixsums.countdiv;

public class Solution {

    public int solution1(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }
        return count;
    }

    public int solution(int A, int B, int K) {
        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }

}
