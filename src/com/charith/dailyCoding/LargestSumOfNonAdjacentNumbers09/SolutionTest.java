package com.charith.dailyCoding.LargestSumOfNonAdjacentNumbers09;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals(13, Solution.solution(new int[]{2, 4, 6, 2, 5}));

        Assertions.assertEquals(10, Solution.solution(new int[]{5, 1, 1, 5}));

        Assertions.assertEquals(18, Solution.solution(new int[]{2, 4, 6, 2, 5, 10}));

        Assertions.assertEquals(110, Solution.solution(new int[]{5, 5, 10, 100, 10, 5}));

        Assertions.assertEquals(4, Solution.solution(new int[]{1, 2, 3}));

        Assertions.assertEquals(20, Solution.solution(new int[]{1, 20, 3}));

    }
}