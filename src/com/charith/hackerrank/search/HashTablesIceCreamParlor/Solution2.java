package com.charith.hackerrank.search.HashTablesIceCreamParlor;

import java.util.*;

public class Solution2 {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> costMap = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            if (money > cost[i]) {
                if (costMap.containsKey(money - cost[i])) {
                    System.out.println(costMap.get(money - cost[i]) + " " + (i + 1));
                    return;
                }
                if (!costMap.containsKey(cost[i])) {
                    costMap.put(cost[i], i + 1);
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
