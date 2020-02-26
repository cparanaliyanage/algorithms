package com.charith.codility.countingelements.frogriverone;

public class Solution {

    public int solution(int X, int[] A) {
        int steps = X;
        if (A.length < X) {
            return -1;
        }
        int[] stepsArray = new int[X + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && stepsArray[A[i]] == 0) {
                stepsArray[A[i]] = 1;
                steps--;
            }
            if (steps == 0) {
                return i;
            }
        }
        return -1;
    }
}
