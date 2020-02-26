package com.charith.hackerrank.StringManipulation.SherlockAndTheValidString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution2 {


    public static String isValid(String s) {
        Map<Long, Long> counts = s.chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .map(Map.Entry::getValue).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        switch (counts.size()) {
            case 1:
                return "YES";
            case 2:
                Iterator<Long> it = counts.keySet().iterator();
                return (Math.abs(it.next() - it.next()) == 1 && (counts.values().stream().anyMatch(i -> i == 1))) ? "YES" : "NO";
            default:
                return "NO";
        }
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