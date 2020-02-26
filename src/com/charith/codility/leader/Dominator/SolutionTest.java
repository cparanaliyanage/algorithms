package com.charith.codility.leader.Dominator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals(0, Solution.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));

        Assertions.assertEquals(-1, Solution.solution(new int[]{3, 3, 1, 4}));

        Assertions.assertEquals(-1, Solution.solution(new int[]{3, 4, 1, 2}));

        Assertions.assertEquals(0, Solution.solution(new int[]{3, 3, 3, 3}));

    }
}