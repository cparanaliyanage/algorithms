package com.charith.hackerrank.StringManipulation.CommonChild;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        if (s1.equals(s2)) {
            return s1.length();
        }
        int[][] commonLength = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    commonLength[i][j] = commonLength[i - 1][j - 1] + 1;
                } else {
                    commonLength[i][j] = Math.max(commonLength[i - 1][j], commonLength[i][j - 1]);
                }
            }
        }
        return commonLength[s1.length()][s2.length()];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
