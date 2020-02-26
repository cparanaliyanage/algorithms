package com.charith.dailyCoding.SerializeTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution() {

        Assertions.assertEquals("test", Solution.serialize(new Node("root",
                new Node("left", new Node("left.left")),
                new Node("right"))));

    }

}