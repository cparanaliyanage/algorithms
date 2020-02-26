package com.charith.hackerrank.Sorting.MergeSortCountingInversions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countInversions function below.
    public static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1, 0);
    }

    static long mergeSort(int[] array, int firstIndex, int lastIndex, long count) {
        if (firstIndex < lastIndex) {
            int midIndex = (lastIndex + firstIndex) / 2;
            //System.out.println("first =" + firstIndex + " middle =" + midIndex);
            count = mergeSort(array, firstIndex, midIndex, count);
            //System.out.println("middle =" + (midIndex + 1) + " last =" + lastIndex);
            count = mergeSort(array, midIndex + 1, lastIndex, count);
            return merge(array, firstIndex, midIndex, lastIndex, count);
        }
        return count;
    }

    static long merge(int[] array, int firstIndex, int middleIndex, int lastIndex, long count) {
        int firstStart = firstIndex;
        int secondStart = middleIndex + 1;
        long swaps = 0;
        while (secondStart <= lastIndex && firstStart <= secondStart) {
            if (array[firstStart] > array[secondStart]) {
                int minimum = array[secondStart];
                for (int i = secondStart; i > firstStart; i--) {
                    array[i] = array[i - 1];
                    swaps++;
                }
                array[firstStart] = minimum;
                secondStart++;
            } else {
                firstStart++;
            }
        }
        //System.out.println("first =" + firstIndex + " middle =" + middleIndex + " last =" + lastIndex);
        //System.out.println(swaps);
        return swaps + count;
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
