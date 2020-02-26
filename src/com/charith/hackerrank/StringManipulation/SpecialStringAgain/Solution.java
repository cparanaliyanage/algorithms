package com.charith.hackerrank.StringManipulation.SpecialStringAgain;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            char character = s.charAt(i);
            count++;
            long substringCount = 1;
            boolean reverse = false;
            for (int j = i + 1; j < n; j++) {
                if (!reverse && s.charAt(j) == character) {
                    substringCount++;
                    count++;
                } else if (!reverse && s.charAt(j) != character) {
                    reverse = true;
                } else if (reverse && s.charAt(j) == character) {
                    substringCount--;
                    if (substringCount == 0) {
                        count++;
                    }
                } else {
                    break;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
