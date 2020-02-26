package com.charith.hackerrank.DynamicProgramming.MaxArraySum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxSubsetSum() {
        Assertions.assertEquals(13, Solution.maxSubsetSum(new int[]{3, 7, 4, 6, 5}));

        //Assertions.assertEquals(11, Solution.maxSubsetSum(new int[]{2, 1, 5, 8, 4}));

        //Assertions.assertEquals(15, Solution.maxSubsetSum(new int[]{3, 5, -7, 8, 10}));
    }
}