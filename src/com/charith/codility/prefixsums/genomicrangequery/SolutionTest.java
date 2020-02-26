package com.charith.codility.prefixsums.genomicrangequery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertArrayEquals(new int[]{2, 4, 1}, Solution.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }
}