package com.charith.codility.prefixsums.minavgtwoslice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(1, Solution.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));

        Assertions.assertEquals(0, Solution.solution(new int[]{4, 2}));

        Assertions.assertEquals(0, Solution.solution(new int[]{-1, 2, 1}));

        Assertions.assertEquals(0, Solution.solution(new int[]{1, 2, -1}));
    }
}