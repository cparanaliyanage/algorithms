package com.charith.hackerrank.StringManipulation.SpecialStringAgain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void substrCount() {
        Assertions.assertEquals(7,Solution.substrCount(5,"asasd"));

        Assertions.assertEquals(10,Solution.substrCount(7,"abcbaba"));

        Assertions.assertEquals(10,Solution.substrCount(7,"abcbaba"));

        Assertions.assertEquals(10,Solution.substrCount(4,"aaaa"));
    }
}