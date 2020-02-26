package com.charith.hackerrank.GreedyAlgorithms.MinimumAbsoluteDifferenceInAnArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minimumAbsoluteDifference() {
        Assertions.assertEquals(3, Solution.minimumAbsoluteDifference(new int[]{3, -7, 0}));

        Assertions.assertEquals(1, Solution.minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}));

        Assertions.assertEquals(3, Solution.minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}));

    }
}