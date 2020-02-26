package com.charith.hackerrank.Arrays.LeftRotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotLeft() {

        Assertions.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, Solution.rotLeft(new int[]{1, 2, 3, 4, 5}, 4));

        Assertions.assertArrayEquals(new int[]{3, 4, 1, 2}, Solution.rotLeft(new int[]{1, 2, 3, 4}, 2));

    }
}