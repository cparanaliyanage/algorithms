package com.charith.codility.maximumSliceProblem.MaxDoubleSliceSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals(17, Solution.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));

        Assertions.assertEquals(17, Solution.solution(new int[]{-3, -2, -6, -1, -4, -5, -1, -2}));

    }
}