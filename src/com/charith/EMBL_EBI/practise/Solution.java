package com.charith.EMBL_EBI.practise;

public class Solution {

    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static String[] fizzBuzzArray(int n) {
        String[] stringArray = new String[n];
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringArray[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                stringArray[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                stringArray[i-1] = "Buzz";
            } else {
                stringArray[i-1] = String.valueOf(i);
            }
        }
        return stringArray;
    }

}
