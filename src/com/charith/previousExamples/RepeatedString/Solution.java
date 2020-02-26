package com.charith.previousExamples.RepeatedString;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numberOfAsInString = 0;
        long totalCount = 0;
        if (n >= s.length()) {
            numberOfAsInString = s.chars().filter(ch -> ch == 'a').count();
            if (numberOfAsInString == 0) {
                return 0;
            }
            long numberOfRepeatedStrings = n / s.length();
            totalCount = numberOfRepeatedStrings * numberOfAsInString;

            n = n % s.length();

        }
        totalCount += s.substring(0, (int) n).chars().filter(ch -> ch == 'a').count();

        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
