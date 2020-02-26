package com.charith.hackerrank.Sorting.FraudulentActivityNotifications;

import java.io.*;
import java.util.*;

public class Solution2 {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int notification = 0;
        int[] histogram = new int[201];

        for (int i = 0; i < d; i++) {
            histogram[expenditure[i]] = histogram[expenditure[i]] + 1;
        }

        for (int i = d; i < expenditure.length; i++) {
            int cursor = 0;
            int currentAmount = expenditure[i];
            double median = 0;
            int left = -1;
            for (int e = 0; e <= 201; e++) {
                cursor += histogram[e];
                if (d % 2 == 1) {
                    if (cursor >= d / 2 + 1) {
                        median = e;
                        break;
                    }
                } else {
                    if (cursor == d / 2) {
                        left = e;
                    }

                    if (cursor > d / 2 && left != -1) {
                        median = (left + e) / 2.0;
                        break;
                    }

                    if (cursor > d / 2 && left == -1) {
                        median = e;
                        break;
                    }
                }
            }
            if (currentAmount >= 2 * median) {
                notification++;
            }
            histogram[expenditure[i - d]]--;
            histogram[expenditure[i]]++;
        }


        return notification;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}