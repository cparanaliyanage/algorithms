package com.charith.hackerrank.RecursionAndBacktracking.RecursiveDigitSum;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        while (n.length() > 1) {
            n = superDigit(n);
        }
        n = String.valueOf(Integer.valueOf(n) * k);
        while (n.length() > 1) {
            n = superDigit(n);
        }
        return Integer.valueOf(n);
    }

    static String superDigit(String n) {
        long sum = 0;
        for (Character character : n.toCharArray()) {
            sum += Character.getNumericValue(character);
        }
        return String.valueOf(sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}