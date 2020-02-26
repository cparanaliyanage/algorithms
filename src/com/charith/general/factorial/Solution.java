package com.charith.general.factorial;

public class Solution {

    public static void main(String[] args) {
        System.out.println(5);
        System.out.println(4);
    }

    public int factorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 1 || n == 0) {
            return n;
        }
        return n * factorial(n - 1);
    }

}
