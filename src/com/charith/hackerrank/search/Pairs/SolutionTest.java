package com.charith.hackerrank.search.Pairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void pairs() {
        Assertions.assertEquals(3, Solution.pairs(2, new int[]{1, 5, 3, 4, 2}));

        Assertions.assertEquals(5, Solution.pairs(2, new int[]{1, 3, 5, 8, 6, 4, 2}));

    }
}