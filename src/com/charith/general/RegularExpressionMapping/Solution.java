package com.charith.general.RegularExpressionMapping;

import java.util.*;

public class Solution {

    public static boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }

    public static boolean isMatch(String string, String pattern, int stringIndex, int patternIndex) {
        if (string.length() - 1 == stringIndex && patternIndex == pattern.length() - 1) {
            return true;
        }
        if (string.length() > stringIndex && patternIndex < pattern.length()) {
            if (pattern.charAt(patternIndex) == '.') {
                patternIndex++;
                stringIndex++;
            } else if (pattern.charAt(patternIndex) == '*') {
                return true;
            } else if (patternIndex + 1 < pattern.length() && pattern.charAt(patternIndex + 1) == '*') {
                if (string.charAt(stringIndex) == pattern.charAt(patternIndex)) {
                    if (stringIndex == string.length() - 1) {
                        patternIndex += 2;
                    }
                    stringIndex++;
                } else {
                    patternIndex += 2;
                }
            } else {
                if (string.charAt(stringIndex) == pattern.charAt(patternIndex)) {
                    stringIndex++;
                    patternIndex++;
                } else {
                    return false;
                }
            }
            return isMatch(string, pattern, stringIndex, patternIndex);
        } else {
            return string.length() - 1 <= stringIndex && patternIndex >= pattern.length() - 1;
        }
    }
}


class Solution1 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Set<String>> emailToOtherEmails = new HashMap<>();
        Map<String, String> emailToName    = new HashMap<>();

        for(List<String> account : accounts){
            String customerName = account.get(0);
        }

        List<List<String>> mergedAccountsList = new ArrayList<>();
/*        for(Map.Entry<String, Set<String>> entry : mergedAccounts.entrySet()){
            List<String> account = new ArrayList<>();
            account.add(entry.getKey());
            account.addAll(entry.getValue());
        }*/
        return mergedAccountsList;
    }
}