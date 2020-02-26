package com.charith.hackerrank.search.HashTablesIceCreamParlor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SolutionTest {

    @Test
    void whatFlavors() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Solution2.whatFlavors(new int[]{1, 4, 5, 3, 2}, 4);
        Assertions.assertEquals("1 4", outContent.toString().trim());

        outContent.reset();

        Solution2.whatFlavors(new int[]{2, 2, 4, 3}, 4);
        Assertions.assertEquals("1 2", outContent.toString().trim());
    }
}