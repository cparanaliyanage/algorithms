package com.charith.hackerrank.StringManipulation.SherlockAndTheValidString;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Integer, Set<Character>> frequencyCharacters = new HashMap<>();
        Map<Character, Integer> characterFrequency = new HashMap<>();
        for (Character character : s.toCharArray()) {

            characterFrequency.merge(character, 1, Integer::sum);
            frequencyCharacters.computeIfAbsent(characterFrequency.get(character), emptySet -> new HashSet<>()).add(character);

            if (frequencyCharacters.get(characterFrequency.get(character) - 1) != null) {
                frequencyCharacters.get(characterFrequency.get(character) - 1).remove(character);
                if (frequencyCharacters.get(characterFrequency.get(character) - 1).size() == 0) {
                    frequencyCharacters.remove(characterFrequency.get(character) - 1);
                }
            }
        }
        if (frequencyCharacters.size() == 1) {
            return "YES";
        }else if(frequencyCharacters.size() == 2 && frequencyCharacters.get(1) !=null && frequencyCharacters.get(1).size() == 1) {
            return "YES";
        }else if (frequencyCharacters.size() == 2) {
            Iterator<Integer> it = frequencyCharacters.keySet().iterator();
            return ((Math.abs(it.next() - it.next()) == 1) && (frequencyCharacters.values().stream().anyMatch(i -> i.size() == 1))) ? "YES" : "NO";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}