package com.charith.hackerrank.Sorting.FraudulentActivityNotifications;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int notification = 0;
        for (int i = d - 1; i < expenditure.length - 2; i++) {
            List<Integer> previousDays = Arrays.stream(Arrays.copyOfRange(expenditure, i - (d - 1), i)).boxed().sorted().collect(Collectors.toList());
            long mean = 0;
            if (d % 2 == 0) {
                mean = (previousDays.get(d / 2 - 1) + previousDays.get(d / 2)) / 2;
            } else {
                mean = previousDays.get(d / 2);
            }
            if (mean * 2 <= expenditure[i + 1]) {
                notification++;
            }
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