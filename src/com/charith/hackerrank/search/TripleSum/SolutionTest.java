package com.charith.hackerrank.search.TripleSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void triplets() {
        Assertions.assertEquals(8, Solution.triplets(new int[]{1, 3, 5}, new int[]{2, 3}, new int[]{1, 2, 3}));

        Assertions.assertEquals(5, Solution.triplets(new int[]{1, 4, 5}, new int[]{2, 3, 3}, new int[]{1, 2, 3}));

        Assertions.assertEquals(12, Solution.triplets(new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 13}));

    }
}