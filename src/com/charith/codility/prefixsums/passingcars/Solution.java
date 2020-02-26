package com.charith.codility.prefixsums.passingcars;

public class Solution {

    public static int solution1(int[] A) {
        int totalCount = 0;
        for (int i = 0; i < A.length; i++) {
            totalCount += A[i];
        }

        int numberOfPairs = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                numberOfPairs += totalCount;
                if (numberOfPairs > 1000000000) {
                    return -1;
                }
            } else {
                totalCount--;
            }
        }
        return numberOfPairs;
    }

    public static int solution(int[] A) {
        int vehiclesToWest = 0;
        int numberOfPairs = 0;
        for (int i = A.length -1 ; i >=0; i--) {
            if (A[i] == 0) {
                numberOfPairs += vehiclesToWest;
                if (numberOfPairs > 1000000000) {
                    return -1;
                }
            } else {
                vehiclesToWest++;
            }
        }
        return numberOfPairs;
    }


}
