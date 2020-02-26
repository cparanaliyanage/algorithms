package com.charith.codility.ChocolatesByNumbers;

public class Solution {

    public int solution1(int N, int M) {
        // write your code in Java SE 8
        int[] chocolateStatuses = new int[N];
        int i = 0;
        int count = 0;
        while (chocolateStatuses[i] == 0) {
            chocolateStatuses[i] = 1;
            count++;
            i = (i + M) % N;
        }
        return count;
    }

    public int solution(int N, int M) {
        // write your code in Java SE 8
        return N / gcd(N, M);
    }

    private static int gcd(int N, int M) {
        if (M == 0) {
            return N;
        }
        return gcd(M, N % M);
    }
}
