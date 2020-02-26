package com.charith.hackerrank.search.MinimumTimeRequired;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the minTime function below.
    static long minTime(long[] machines, long goal) {
        int time = 0;
        while (true) {
            int items = 0;
            for (int i = 0; i < machines.length; i++) {
                items += time / machines[i];
            }
            if (items == goal) {
                return time;
            }
            time++;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nGoal = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nGoal[0]);

        long goal = Long.parseLong(nGoal[1]);

        long[] machines = new long[n];

        String[] machinesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long machinesItem = Long.parseLong(machinesItems[i]);
            machines[i] = machinesItem;
        }

        long ans = minTime(machines, goal);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}