package com.charith.hackerrank.Sorting.MergeSortCountingInversions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void countInversions() {
        Assertions.assertEquals(3, Solution.countInversions(new int[]{2, 1, 3, 1, 2}));
    }
}