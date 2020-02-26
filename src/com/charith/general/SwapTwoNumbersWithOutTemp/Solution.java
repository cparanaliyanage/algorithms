package com.charith.general.SwapTwoNumbersWithOutTemp;

public class Solution {

    // TODO https://javarevisited.blogspot.com/2013/02/swap-two-numbers-without-third-temp-variable-java-program-example-tutorial.html

    public static int[] swapTwoNumbers(int[] numbers) {
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        return numbers;
    }
}
