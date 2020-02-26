package com.charith.codility.timecomplexity.frogjmp;

public class Solution {

    public int solution(int X, int Y, int D) {
        int distanceToJump = Y - X;
        return (int) Math.ceil((double) distanceToJump / D);
    }

}
