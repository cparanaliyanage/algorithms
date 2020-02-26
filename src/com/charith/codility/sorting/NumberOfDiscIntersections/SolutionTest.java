package com.charith.codility.sorting.NumberOfDiscIntersections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(11, Solution.solution(new int[]{1, 5, 2, 1, 4, 0}));
    }
}