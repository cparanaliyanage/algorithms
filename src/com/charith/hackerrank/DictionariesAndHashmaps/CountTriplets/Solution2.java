package com.charith.hackerrank.DictionariesAndHashmaps.CountTriplets;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution2 {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> elementCounts = new HashMap<>();
        for (Long element : arr) {
            elementCounts.merge(element, 1L, Long::sum);
        }
        long total = 0;
        Map<Long, Long> processedElements = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            Long currentValue = arr.get(i);
            elementCounts.merge(currentValue, -1L, Long::sum);

            if (currentValue % r == 0 && elementCounts.containsKey(currentValue * r) && processedElements.containsKey(currentValue / r)) {
                total += elementCounts.get(currentValue * r) * processedElements.get(currentValue / r);
            }

            processedElements.merge(currentValue, 1L, Long::sum);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
