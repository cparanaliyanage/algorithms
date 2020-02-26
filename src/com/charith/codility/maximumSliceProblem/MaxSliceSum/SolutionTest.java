package com.charith.codility.maximumSliceProblem.MaxSliceSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(6, Solution.solution(new int[]{-2, 4, 2}));

        Assertions.assertEquals(2, Solution.solution(new int[]{2, -4, 2}));
    }
}