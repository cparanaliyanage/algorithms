package com.charith.codility.sorting.NumberOfDiscIntersections;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        int[] lowerBound = new int[A.length];
        long[] upperBound = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            lowerBound[i] = i - A[i];
            upperBound[i] = (long) i + A[i];
        }
        Arrays.sort(lowerBound);
        Arrays.sort(upperBound);
        int totalIntersections = 0;
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            while (j < A.length && upperBound[i] >= lowerBound[j]) {
                totalIntersections += j;
                totalIntersections -= i;
                j++;
            }
        }
        if (totalIntersections > 10000000) {
            return -1;
        }
        return totalIntersections;
    }
}
