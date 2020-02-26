package com.charith.codility.countingelements.maxcounters;

public class Solution {

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1]++;
                maxCount = Math.max(maxCount, counters[A[i] - 1]);
            } else {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxCount;
                }
            }
        }
        return counters;
    }

    public static int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int lastMax = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1] = Math.max(A[i] - 1, lastMax);
                counters[A[i] - 1]++;
                max = Math.max(max, counters[A[i] - 1]);
            } else {
                lastMax = max;
            }
        }
        for (int j = 0; j < counters.length; j++) {
            counters[j] = Math.max(lastMax, counters[j]);
        }
        return counters;
    }

}
