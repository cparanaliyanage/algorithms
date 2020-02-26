package com.charith.codility.sorting.distinct;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        if (A.length < 2) {
            return A.length;
        }
        Arrays.sort(A);
        int distinctCount = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] != A[i]) {
                distinctCount++;
            }
        }
        return distinctCount;
    }

}
