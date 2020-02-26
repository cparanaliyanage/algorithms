package com.charith.hackerrank.DictionariesAndHashmaps.TwoStrings;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        for (char character : s1.toCharArray()){
            s1Map.merge(character,1, Integer::sum);
        }
        for (char character : s2.toCharArray()){
            s2Map.merge(character,1, Integer::sum);
        }
        for(Character character : s1Map.keySet()){
            if(s2Map.containsKey(character)){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
