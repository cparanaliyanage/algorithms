package com.charith.hackerrank.Arrays.NewYearChaos;

import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int count = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] != i + 1) {
                if ((i + 1 < q.length) && (q[i+1] == (i + 1)) ) {
                    count++;
                    swap(q, i, (i + 1));
                } else if ((i + 2 < q.length) && (q[i+2] == (i + 1)) ) {
                    count += 2;
                    swap(q, (i + 1), (i + 2));
                    swap(q, i, (i + 1));
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(count);
    }

    private static void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
