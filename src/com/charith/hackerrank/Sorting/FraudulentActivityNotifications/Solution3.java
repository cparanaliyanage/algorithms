package com.charith.hackerrank.Sorting.FraudulentActivityNotifications;

import java.io.*;
import java.util.*;

public class Solution3 {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int notification = 0;
        int[] histogram = new int[201];
        for (int i = 0; i < d; i++) {
            histogram[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length; i++) {
            int mean = 0;
            boolean leftFound = false;
            boolean rightFound = false;
            int currentPosition = 0;
            for (int j = 0; j < 201; j++) {

                currentPosition += histogram[j];

                if (!leftFound && currentPosition >= (d % 2 == 0 ? (d / 2) : (d / 2) + 1)) {
                    mean += j;
                    leftFound = true;
                }
                if (currentPosition >= (d / 2) + 1) {
                    mean += j;
                    rightFound = true;
                }
                if (leftFound && rightFound) {
                    break;
                }
            }
            if (mean <= expenditure[i]) {
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