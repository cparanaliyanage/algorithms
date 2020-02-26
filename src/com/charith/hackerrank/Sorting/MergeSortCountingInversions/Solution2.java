package com.charith.hackerrank.Sorting.MergeSortCountingInversions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    static long countInversions(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        int midPosition = arr.length >> 1;
        int[] leftArray = Arrays.copyOfRange(arr, 0, midPosition);
        int[] rightArray = Arrays.copyOfRange(arr, midPosition, arr.length);
        long inversions = countInversions(leftArray) + countInversions(rightArray);


        int leftStart = 0;
        int rightStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftStart < leftArray.length && (rightStart >= rightArray.length || leftArray[leftStart] <= rightArray[rightStart])) {
                arr[i] = leftArray[leftStart++];
                inversions += rightStart;
            } else if (rightStart < rightArray.length) {
                arr[i] = rightArray[rightStart++];
            }
        }
        return inversions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
