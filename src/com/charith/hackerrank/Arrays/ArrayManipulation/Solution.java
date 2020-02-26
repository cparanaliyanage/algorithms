package com.charith.hackerrank.Arrays.ArrayManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long array[] = new long[n+1];
        for (int[] query : queries) {
            array[query[0]-1] += query[2];
            array[query[1]] -= query[2];
        }
        for (int i = 0; i < n; i++) {
            array[i+1] += array[i];
        }
        return Arrays.stream(array).max().getAsLong();
    }

    static long arrayManipulationOld(int n, int[][] queries) {
        long array[] = new long[n];
        for (int[] query : queries) {
            IntStream intStream = IntStream.range(query[0]-1,query[1]);
            intStream.parallel().forEach(x -> array[x] += query[2]);
        }
        return Arrays.stream(array).max().getAsLong();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
