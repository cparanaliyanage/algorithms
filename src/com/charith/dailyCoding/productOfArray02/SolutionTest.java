package com.charith.dailyCoding.productOfArray02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, Solution.solution(new int[]{1, 2, 3, 4, 5}));

    }
}