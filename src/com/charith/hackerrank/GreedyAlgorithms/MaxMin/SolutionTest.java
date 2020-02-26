package com.charith.hackerrank.GreedyAlgorithms.MaxMin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxMin() {
        Assertions.assertEquals(20, Solution.maxMin(3, new int[]{10, 100, 300, 200, 1000, 20, 30}));
    }
}