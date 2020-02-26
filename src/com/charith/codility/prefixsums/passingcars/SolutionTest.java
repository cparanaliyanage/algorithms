package com.charith.codility.prefixsums.passingcars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(5, Solution.solution(new int[]{0, 1, 0, 1, 1}));

        Assertions.assertEquals(0, Solution.solution(new int[]{0, 0}));

        Assertions.assertEquals(0, Solution.solution(new int[]{1, 1}));

        Assertions.assertEquals(2, Solution.solution(new int[]{1, 0, 1, 1}));
    }
}