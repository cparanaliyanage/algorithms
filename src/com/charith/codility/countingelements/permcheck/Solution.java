package com.charith.codility.countingelements.permcheck;

public class Solution {

    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (seen[A[i]] || A[i] < 0 || A[i] > A.length) {
                return 0;
            }
            seen[A[i]] = true;
        }
        return 1;
    }
}
