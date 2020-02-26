package com.charith.general.reverseArray;

public class Solution {

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 22, 35, 44};
        int[] reverse = reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Reverse " + array[i] + " -> " + reverse[i]);
        }
    }
}
