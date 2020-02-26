package com.charith.codility.arrays.cyclicrotation;

public class Solution {

    public static int[] solution(int[] A, int K) {
        int gcd = gcd(A.length, K);
        for (int i = 0; i < gcd; i++) {
            int temp = A[i];
            int j = i;
            for (; j + gcd < A.length; j = j + gcd) {
                A[j] = A[j + gcd];
            }
            A[j] = temp;
        }
        return A;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
