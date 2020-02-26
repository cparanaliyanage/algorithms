package com.charith.hackerrank.GreedyAlgorithms.LuckBalance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void luckBalance() {
        Assertions.assertEquals(10, Solution.luckBalance(2, new int[][]{{5, 1}, {1, 1}, {4, 0}}));

        Assertions.assertEquals(8, Solution.luckBalance(1, new int[][]{{5, 1}, {1, 1}, {4, 0}}));

        Assertions.assertEquals(29, Solution.luckBalance(3, new int[][]{{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}}));

    }
}