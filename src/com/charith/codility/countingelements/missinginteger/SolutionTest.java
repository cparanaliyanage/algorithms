package com.charith.codility.countingelements.missinginteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(4, Solution.solution(new int[]{1, 2, 3}));

        Assertions.assertEquals(1, Solution.solution(new int[]{-1, -3}));

        Assertions.assertEquals(5, Solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}