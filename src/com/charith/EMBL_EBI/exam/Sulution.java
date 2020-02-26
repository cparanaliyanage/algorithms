package com.charith.EMBL_EBI.exam;

import java.util.HashSet;
import java.util.Set;

public class Sulution {

    public static long substringCalculator1(String s) {
        // Write your code here
        Set<String> distinctString = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                distinctString.add(s.substring(i, j));
            }
        }
        return distinctString.size();
    }

    public static long substringCalculator2(String s) {
        // Write your code here
        Set<String> distinctString = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String tempString = "";
            for (int j = i; j < s.length(); j++) {
                tempString += s.charAt(j);
                distinctString.add(tempString.toString());
            }
        }
        return distinctString.size();
    }

    public static long substringCalculator(String s) {
        // Write your code here
        return s.length() * (s.length() + 1) / 2;
    }

}
