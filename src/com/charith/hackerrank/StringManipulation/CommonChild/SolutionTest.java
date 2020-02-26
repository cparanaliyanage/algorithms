package com.charith.hackerrank.StringManipulation.CommonChild;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void commonChild() {
        Assertions.assertEquals(2, Solution.commonChild("HARRY", "SALLY"));

        Assertions.assertEquals(0, Solution.commonChild("AA", "BB"));

        Assertions.assertEquals(3, Solution.commonChild("SHINCHAN", "NOHARAAA"));

        Assertions.assertEquals(2, Solution.commonChild("ABCDEF", "FBDAMN"));

    }
}