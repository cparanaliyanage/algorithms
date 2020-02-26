package com.charith.hackerrank.RecursionAndBacktracking.RecursiveDigitSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void superDigit() {
        Assertions.assertEquals(3, Solution.superDigit("148", 3));

        Assertions.assertEquals(8, Solution.superDigit("9875", 4));

        Assertions.assertEquals(9, Solution.superDigit("123", 3));
    }
}