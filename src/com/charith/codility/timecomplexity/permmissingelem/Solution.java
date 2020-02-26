package com.charith.codility.timecomplexity.permmissingelem;

public class Solution {

    public int solution(int[] A) {
        int maxElement = A.length + 1;
        int[] elementArray = new int[maxElement];
        for (int i = 0; i < A.length; i++) {
            elementArray[A[i] - 1] = 1;
        }

        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] == 0) {
                return i + 1;
            }
        }
        return maxElement + 1;
    }

    public int solution2(int[] A) {
        long maxElement = A.length + 1;
        long totalSum = maxElement * (maxElement + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            totalSum -= A[i];
        }
        return (int) totalSum;
    }

}
