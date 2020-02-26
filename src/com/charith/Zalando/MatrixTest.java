package com.charith.Zalando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixTest {

    @Test
    void solution() {

        Assertions.assertEquals("11001,10100", Matrix.solution(3, 2, new int[]{2, 1, 1, 0, 1}));

    }
}