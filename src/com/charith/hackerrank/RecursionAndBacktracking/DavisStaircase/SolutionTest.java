package com.charith.hackerrank.RecursionAndBacktracking.DavisStaircase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void stepPerms() {
        Assertions.assertEquals(1, Solution.stepPerms(1));

        Assertions.assertEquals(4, Solution.stepPerms(3));

        Assertions.assertEquals(13, Solution.stepPerms(5));

        Assertions.assertEquals(44, Solution.stepPerms(7));
    }
}