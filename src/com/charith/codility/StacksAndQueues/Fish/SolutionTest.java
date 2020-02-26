package com.charith.codility.StacksAndQueues.Fish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals(2, Solution.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }
}