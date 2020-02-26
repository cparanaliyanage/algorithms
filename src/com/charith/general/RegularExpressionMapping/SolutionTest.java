package com.charith.general.RegularExpressionMapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isMatch() {

        Assertions.assertEquals(true, Solution.isMatch("aab", ".*"));

        Assertions.assertEquals(false, Solution.isMatch("aab", ".a*"));

        Assertions.assertEquals(false, Solution.isMatch("aa", "a"));

        Assertions.assertEquals(true, Solution.isMatch("aa", "a*"));

        Assertions.assertEquals(true, Solution.isMatch("ab", ".*"));

        Assertions.assertEquals(true, Solution.isMatch("aab", "c*a*b*"));

        Assertions.assertEquals(true, Solution.isMatch("mississippi", "mis*is*p*."));
    }
}