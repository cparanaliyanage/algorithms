package com.charith.hackerrank.RecursionAndBacktracking.PasswordCracker;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'passwordCracker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY passwords
     *  2. STRING loginAttempt
     */

    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        // Write your code here

        Set<Character> passwordCharacters = new HashSet<>();
        for (String password : passwords) {
            passwordCharacters.addAll(password.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
        }
        for (Character character : loginAttempt.toCharArray()) {
            if(!passwordCharacters.contains(character)){
                return "WRONG PASSWORD";
            }
        }

        StringBuilder stringJoiner = new StringBuilder();
        StringBuilder currentString = new StringBuilder();
        for (int i = 0; i < loginAttempt.length(); i++) {
            currentString.append(loginAttempt.charAt(i));
            if (passwords.contains(currentString.toString())) {
                if (i < loginAttempt.length() - 1) {
                    String returnString = passwordCracker(passwords, loginAttempt.substring(i + 1));

                    if (!returnString.equals("WRONG PASSWORD")) {
                        stringJoiner.append(currentString).append(" ").append(returnString);
                        return stringJoiner.toString();
                    }
                } else if (i == loginAttempt.length() - 1) {
                    stringJoiner.append(currentString);
                }
            } else if (i == loginAttempt.length() - 1) {
                return "WRONG PASSWORD";
            }
        }
        return stringJoiner.toString().trim();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> passwords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList());

                String loginAttempt = bufferedReader.readLine();

                String result = Result.passwordCracker(passwords, loginAttempt);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}