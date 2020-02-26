package com.charith.hackerrank.DictionariesAndHashmaps.FrequencyQueries;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution2 {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> elementMap = new HashMap<>();
        Map<Integer, Set<Integer>> frequencyMap = new HashMap<>();
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            if (query.get(0) == 1) {
                int previousFrequency = elementMap.getOrDefault(query.get(1), 0);
                int currentFrequency = previousFrequency + 1;

                elementMap.put(query.get(1), currentFrequency);

                if (previousFrequency != 0) {
                    frequencyMap.get(previousFrequency).remove(query.get(1));
                }

                if (!frequencyMap.containsKey(currentFrequency)) {
                    frequencyMap.put(currentFrequency, new HashSet<>());
                }
                frequencyMap.get(currentFrequency).add(query.get(1));
            } else if (query.get(0) == 2) {
                if (elementMap.containsKey(query.get(1))) {
                    int previousFrequency = elementMap.get(query.get(1));
                    int currentFrequency = previousFrequency - 1;

                    if (currentFrequency == 0) {
                        elementMap.remove(query.get(1));
                    } else {
                        elementMap.put(query.get(1), currentFrequency);
                    }

                    frequencyMap.get(previousFrequency).remove(query.get(1));

                    if (currentFrequency != 0) {
                        frequencyMap.get(currentFrequency).add(query.get(1));
                    }
                }
            } else if (query.get(0) == 3) {
                result.add(frequencyMap.getOrDefault(query.get(1), Collections.emptySet()).isEmpty() ? 0 : 1);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
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
