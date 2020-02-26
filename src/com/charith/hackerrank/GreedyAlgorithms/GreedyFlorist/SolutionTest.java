package com.charith.hackerrank.GreedyAlgorithms.GreedyFlorist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void getMinimumCost() {
        Assertions.assertEquals(13, Solution.getMinimumCost(3, new int[]{2, 5, 6}));
    }
}