package com.charith.codility.sorting.triangle;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] > A[i] - A[i - 1]) {
                return 1;
            }
        }
        return 0;
    }
}
