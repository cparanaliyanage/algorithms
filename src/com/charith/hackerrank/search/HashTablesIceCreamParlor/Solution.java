package com.charith.hackerrank.search.HashTablesIceCreamParlor;

import java.util.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        for (int i = 0; i < cost.length; i++) {
            for (int j = i + 1; j < cost.length; j++) {
                if (money == (cost[i] + cost[j])) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
