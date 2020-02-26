package com.charith.codility.arrays.cyclicrotation;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {
        Assertions.assertArrayEquals(new int[]{0, 0, 0}, Solution.solution(new int[]{0, 0, 0}, 1));

        Assertions.assertArrayEquals(new int[]{9, 7, 6, 3, 8}, Solution.solution(new int[]{3, 8, 9, 7, 6}, 3));

    }


}