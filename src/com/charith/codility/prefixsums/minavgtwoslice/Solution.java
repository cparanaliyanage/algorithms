package com.charith.codility.prefixsums.minavgtwoslice;

public class Solution {

    public static int solution1(int[] A) {
        double minimumAverage = Integer.MAX_VALUE;
        int location = 0;
        for (int i = 0; i < A.length - 1; i++) {
            double average = (double) (A[i] + A[i + 1]) / 2;
            double total = A[i] + A[i + 1];
            for (int j = i + 2; j < A.length; j++) {
                total += A[j];
                average = Math.min(average, total / (j - i + 1));
            }
            if (minimumAverage > average) {
                location = i;
                minimumAverage = average;
            }
        }
        return location;
    }

    public static int solution(int[] A) {
        double minimumAverage = 10001;
        int index = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (minimumAverage > ((A[i] + A[i + 1]) / 2.0)) {
                minimumAverage = (double) (A[i] + A[i + 1]) / 2.0;
                index = i;
            }
            if (i + 2 < A.length && minimumAverage > ((A[i] + A[i + 1] + A[i + 2]) / 3.0)) {
                minimumAverage = (double) (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                index = i;
            }
        }
        return index;
    }
}
