package com.charith.codility.countingelements.maxcounters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, Solution.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}