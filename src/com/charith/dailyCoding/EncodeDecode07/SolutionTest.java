package com.charith.dailyCoding.EncodeDecode07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decode() {
        Assertions.assertEquals(3, Solution.decode("111"));

        Assertions.assertEquals(2, Solution.decode("110"));

        Assertions.assertEquals(1, Solution.decode("011"));

        Assertions.assertEquals(2, Solution.decode("101"));

        // iterative
        Assertions.assertEquals(3, Solution.decodeIterative("111"));

        Assertions.assertEquals(2, Solution.decodeIterative("110"));

        Assertions.assertEquals(1, Solution.decodeIterative("011"));

        Assertions.assertEquals(2, Solution.decodeIterative("101"));
    }
}