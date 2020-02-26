package com.charith.hackerrank.DictionariesAndHashmaps.SherlockAndAnagrams;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> keyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);
                keyMap.merge(subString.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining()), 1, Integer::sum);
            }
        }
        return keyMap.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
