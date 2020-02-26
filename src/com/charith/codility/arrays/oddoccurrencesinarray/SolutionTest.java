package com.charith.codility.arrays.oddoccurrencesinarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertEquals(7, Solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}