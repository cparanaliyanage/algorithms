package com.charith.codility.PrimeAndCompositeNumbers.MinPerimeterRectangle;

public class Solution {

    public int solution(int N) {
        int minimumPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                minimumPerimeter = Math.min(minimumPerimeter, 2 * (N / i + i));
            }
        }
        return minimumPerimeter;
    }

}
