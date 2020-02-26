package com.charith.hackerrank.RecursionAndBacktracking.PasswordCracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ResultTest {

    @Test
    void passwordCracker() {

        Assertions.assertEquals("ab cd",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("ab", "abcd", "cd")),
                        "abcd"));

        Assertions.assertEquals("we do what we must because we can",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("because", "can", "do", "must", "we", "what")),
                        "wedowhatwemustbecausewecan"));

        Assertions.assertEquals("WRONG PASSWORD",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("hello", "planet")),
                        "helloworld"));

        Assertions.assertEquals("we do what we must because we can",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("because", "can", "do", "must", "we", "what")),
                        "wedowhatwemustbecausewecan"));

        Assertions.assertEquals("zfzahm",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("ozkxyhkcst", "xvglh", "hpdnb", "zfzahm")),
                        "zfzahm"));

        Assertions.assertEquals("gurwgrb",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("gurwgrb", "maqz", "holpkhqx", "aowypvopu")),
                        "gurwgrb"));

        Assertions.assertEquals("WRONG PASSWORD",
                Result.passwordCracker(new ArrayList<>(Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")),
                        "aaaaaaaaaab"));
    }
}