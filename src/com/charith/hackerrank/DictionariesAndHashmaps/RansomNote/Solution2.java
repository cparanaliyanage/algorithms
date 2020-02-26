package com.charith.hackerrank.DictionariesAndHashmaps.RansomNote;

import java.util.*;

public class Solution2 {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        for (String word : magazine) {
            magazineMap.merge(word, 1, Integer::sum);
        }
        Map<String, Integer> notesMap = new HashMap<>();
        for (String singleNote : note) {
            notesMap.merge(singleNote, 1, Integer::sum);
        }
        for(String key : notesMap.keySet()){
            if(!magazineMap.containsKey(key) || magazineMap.get(key) < notesMap.get(key)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

