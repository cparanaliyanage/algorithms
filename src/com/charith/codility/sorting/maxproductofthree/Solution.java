package com.charith.codility.sorting.maxproductofthree;

import java.util.Arrays;

public class Solution {

    public int solution1(int[] A) {
        Arrays.sort(A);
        return Math.max(A[A.length - 3] * A[A.length - 2] * A[A.length - 1], A[0] * A[1] * A[A.length - 1]);
    }

    public int solution(int[] A) {
        int MINIMUM1 = Integer.MAX_VALUE;
        int MINIMUM2 = Integer.MAX_VALUE;

        int MAXIMUM1 = Integer.MIN_VALUE;
        int MAXIMUM2 = Integer.MIN_VALUE;
        int MAXIMUM3 = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (MINIMUM1 > A[i]) {
                MINIMUM2 = MINIMUM1;
                MINIMUM1 = A[i];
            } else if (MINIMUM2 > A[i]) {
                MINIMUM2 = A[i];
            }

            if (MAXIMUM1 < A[i]) {
                MAXIMUM3 = MAXIMUM2;
                MAXIMUM2 = MAXIMUM1;
                MAXIMUM1 = A[i];
            } else if (MAXIMUM2 < A[i]) {
                MAXIMUM3 = MAXIMUM2;
                MAXIMUM2 = A[i];
            } else if (MAXIMUM3 < A[i]) {
                MAXIMUM3 = A[i];
            }
        }
        return Math.max(MAXIMUM1 * MINIMUM1 * MINIMUM2, MAXIMUM1 * MAXIMUM2 * MAXIMUM3);
    }
}
