package com.charith.EMBL_EBI.practise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void fizzBuzz() {

        Assertions.assertArrayEquals(new String[]{"1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"}, Solution.fizzBuzzArray(15));

    }
}