package com.charith.dailyCoding.SumOfTwoNumbers01;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean solution(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solution2(int[] array, int sum) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(numbers.contains(sum-array[i])){
                return true;
            }
            numbers.add(array[i]);
        }
        return false;
    }
}
