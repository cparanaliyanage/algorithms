package com.charith.general.fib;

public class Solution {

    public static void main(String[] args) {
        System.out.println(fib(5) + " " + fibIterative(5));
        System.out.println(fib(6) + " " + fibIterative(6));
        System.out.println(fib(7) + " " + fibIterative(7));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int previousFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib = fib + previousFib;
            previousFib = temp;
        }
        return fib;
    }
}
