package com.charith.hackerrank.DictionariesAndHashmaps.FrequencyQueries;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> output = new ArrayList<>();
        Map<Integer, Integer> elementMap = new HashMap<>();
        Map<Integer, Integer> frequenceyMap = new HashMap<>();
        for (int[] query : queries) {
            Integer value = query[1];
            switch (query[0]) {
                case 1:
                    frequenceyMap.computeIfPresent(elementMap.get(value), (k, v) -> v = Math.max(0, v = v - 1));
                    elementMap.merge(value, 1, Integer::sum);
                    frequenceyMap.merge(elementMap.get(value), 1, Integer::sum);
                    break;
                case 2:
                    frequenceyMap.computeIfPresent(elementMap.get(value), (k, v) -> v = Math.max(0, v = v - 1));
                    elementMap.computeIfPresent(value, (k, v) -> Math.max(0, v = v - 1));
                    frequenceyMap.merge(elementMap.get(value), 1, Integer::sum);
                    break;
                case 3:
                    output.add(frequenceyMap.getOrDefault(value, 0) > 0 ? 1 : 0);
                    break;
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<int[]> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .mapToInt(Integer::valueOf)
                                .toArray()
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
