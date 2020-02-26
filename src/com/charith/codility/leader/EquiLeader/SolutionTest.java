package com.charith.codility.leader.EquiLeader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals(2, Solution.solution(new int[]{4, 3, 4, 4, 4, 2}));

        Assertions.assertEquals(0, Solution.solution(new int[]{4}));

        Assertions.assertEquals(0, Solution.solution(new int[]{}));

        Assertions.assertEquals(0, Solution.solution(new int[]{4, 3, 2 ,1}));

        Assertions.assertEquals(0, Solution.solution(new int[]{4, 3, 2 ,2}));

    }
}