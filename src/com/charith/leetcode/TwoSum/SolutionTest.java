package com.charith.leetcode.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {

        Assertions.assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));

    }
}