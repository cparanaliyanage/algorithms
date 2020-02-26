package com.charith.hackerrank.search.MinimumTimeRequired;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minTime() {
        Assertions.assertEquals(6, Solution.minTime(new long[]{2, 3}, 5));

        Assertions.assertEquals(7, Solution.minTime(new long[]{1, 3, 4}, 10));

        Assertions.assertEquals(20, Solution.minTime(new long[]{4, 5, 6}, 12));
    }
}