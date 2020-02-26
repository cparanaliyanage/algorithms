package com.charith.hackerrank.DynamicProgramming.MaxArraySum;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int result = 0;
        int useSum = 0;
        int notUseSum = 0;
        for (int number : arr) {
            result = Math.max(result, notUseSum + number);

            int nextUseSum = notUseSum + number;
            int nextNotUseSum = Math.max(useSum, notUseSum);

            useSum = nextUseSum;
            notUseSum = nextNotUseSum;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
