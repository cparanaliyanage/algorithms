package com.charith.hackerrank.GreedyAlgorithms.LuckBalance;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        List<Integer> importantContests = new ArrayList<>();
        int maxLuckFromUnImportantContests = 0;

        for (int[] contest : contests) {
            if (contest[1] == 1) {
                importantContests.add(contest[0]);
            } else {
                if (contest[0] > 0) {
                    maxLuckFromUnImportantContests += contest[0];
                }
            }
        }
        Collections.sort(importantContests);

        int minimumWins = importantContests.size() - k;
        for (Integer integer : importantContests) {
            maxLuckFromUnImportantContests += minimumWins > 0 ? -1 * integer : integer;
            minimumWins--;
        }
        return maxLuckFromUnImportantContests;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}