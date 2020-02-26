package com.charith.dailyCoding.productOfArray02;

public class Solution {

    public static int[] solution(int[] array) {
        int totalSum = 0;
        int[] productArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        if (totalSum != 0) {
            for (int i = 0; i < array.length; i++) {
                productArray[i] = totalSum / array[i];
            }
        }
        return productArray;
    }

    public static int[] solution2(int[] array) {
        int[] leftProductArray = new int[array.length + 1];
        leftProductArray[0] = 1;
        for (int i = 1; i <= array.length; i++) {
            leftProductArray[i + 1] = leftProductArray[i] * array[i];
        }

        int[] rightProductArray = new int[array.length + 1];
        rightProductArray[array.length] = 1;
        for (int i = array.length; i >= 1; i--) {
            rightProductArray[i - 1] = rightProductArray[i] * array[i];
        }

        int[] productArray = new int[array.length];
        for (int i = 1; i <= productArray.length; i++) {
            productArray[i] = leftProductArray[i + 1] * rightProductArray[i - 1];
        }
        return productArray;
    }
}
