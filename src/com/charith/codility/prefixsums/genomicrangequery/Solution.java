package com.charith.codility.prefixsums.genomicrangequery;

public class Solution {
    public static int[] solution1(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            String subString = S.substring(P[i], Q[i] + 1);
            if (subString.contains("A")) {
                result[i] = 1;
            } else if (subString.contains("C")) {
                result[i] = 2;
            } else if (subString.contains("G")) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[][] characterDistribution = new int[3][S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            int a = 0, c = 0, g = 0;
            Character character = S.charAt(i);
            if (character == 'A') {
                a = 1;
            } else if (character == 'C') {
                c = 1;
            } else if (character == 'G') {
                g = 1;
            }
            characterDistribution[0][i + 1] = characterDistribution[0][i] + a;
            characterDistribution[1][i + 1] = characterDistribution[1][i] + c;
            characterDistribution[2][i + 1] = characterDistribution[2][i] + g;
        }
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (characterDistribution[0][Q[i] + 1] - characterDistribution[0][P[i]] > 0) {
                result[i] = 1;
            } else if (characterDistribution[1][Q[i] + 1] - characterDistribution[1][P[i]] > 0) {
                result[i] = 2;
            } else if (characterDistribution[2][Q[i] + 1] - characterDistribution[2][P[i]] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }
}
