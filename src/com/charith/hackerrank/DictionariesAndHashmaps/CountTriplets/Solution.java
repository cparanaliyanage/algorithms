package com.charith.hackerrank.DictionariesAndHashmaps.CountTriplets;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> elementCounts = new HashMap<>();
        for (Long element : arr) {
            elementCounts.merge(element, 1L, Long::sum);
        }
        int total = 0;
        Map<Long, Long> tuples = new HashMap<>();

        for (Long value : arr) {
            if (value % r == 0 && tuples.containsKey(value / r)) {
                total += tuples.get(value / r);
            }
            if (tuples.containsKey(value)) {
                tuples.put(value, tuples.get(value) + elementCounts.get(value / r));
            } else if (value % r == 0 && elementCounts.containsKey(value / r)) {
                tuples.put(value, elementCounts.get(value / r));
            }
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
