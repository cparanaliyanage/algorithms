package com.charith.codility.countingelements.missinginteger;

import java.util.Arrays;

public class Solution {

    public static int solution2(int[] A) {
        int smallestPositiveInteger = 1;
        boolean positiveIntegersFound = false;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 1) {
                continue;
            }
            positiveIntegersFound = true;
            if (A[i] - smallestPositiveInteger == 1) {
                smallestPositiveInteger = A[i];
            } else {
                break;
            }
        }
        return positiveIntegersFound ? ++smallestPositiveInteger : smallestPositiveInteger;
    }

    public static int solution1(int[] A) {
        int smallestPositiveInteger = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] == smallestPositiveInteger) {
                smallestPositiveInteger++;
            }
        }
        return smallestPositiveInteger;
    }

    public static int solution(int[] A) {
        int smallestPositiveInteger = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1) {
                continue;
            }
            if (A[i] == smallestPositiveInteger) {
                smallestPositiveInteger++;
            } else {
                break;
            }
        }
        return smallestPositiveInteger;
    }
}
