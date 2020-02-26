package com.charith.codility.PrimeAndCompositeNumbers.CountFactors;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int N) {
        Set<Integer> uniqueFactors = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                uniqueFactors.add(i);
            }
        }
        return uniqueFactors.size();
    }

}
