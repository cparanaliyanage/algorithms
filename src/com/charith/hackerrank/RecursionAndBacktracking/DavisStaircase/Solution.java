package com.charith.hackerrank.RecursionAndBacktracking.DavisStaircase;

import java.io.*;
import java.util.*;

public class Solution {

    private static Map<Integer, Integer> counts = new HashMap<>();
    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }
        if(counts.containsKey(n)){
            counts.put(n, stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3));
        }
        return counts.get(n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

