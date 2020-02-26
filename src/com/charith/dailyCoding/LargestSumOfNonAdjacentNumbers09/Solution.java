package com.charith.dailyCoding.LargestSumOfNonAdjacentNumbers09;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] array) {
        int[] numberProduct = new int[array.length];
        numberProduct[0] = array[0];
        numberProduct[1] = array[1];
        for (int i = 2; i < array.length; i++) {
            numberProduct[i - 1] = Math.max(numberProduct[i - 2], numberProduct[i - 1]);
            numberProduct[i] = Math.max(numberProduct[i - 2], numberProduct[i - 2] + array[i]);
        }
        Arrays.sort(numberProduct);
        return numberProduct[array.length - 1];
    }
}
