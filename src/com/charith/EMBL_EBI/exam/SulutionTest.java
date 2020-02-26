package com.charith.EMBL_EBI.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulutionTest {

    @Test
    void substringCalculator() {

        Assertions.assertEquals(53, Sulution.substringCalculator("kincenvizh"));

        Assertions.assertEquals(15, Sulution.substringCalculator("abcde"));

    }
}