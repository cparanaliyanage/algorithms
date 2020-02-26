package com.charith.general.SwapTwoNumbersWithOutTemp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapTwoNumbers() {

        Assertions.assertArrayEquals(new int[]{2, 1}, Solution.swapTwoNumbers(new int[]{1, 2}));

        Assertions.assertArrayEquals(new int[]{5, 4}, Solution.swapTwoNumbers(new int[]{4, 5}));

    }
}