package com.charith.dailyCoding.EncodeDecode07;

public class Solution {

    public static int decodeIterative(String encodedString) {
        int[] ways = {1, 0};
        for (int i = 0; i < encodedString.length(); ++i) {
            int w = 0;
            boolean foundTwoDigit = false;
            if ((i > 0) && (Integer.valueOf(encodedString.substring(i - 1, i+1)) < 27 && Integer.valueOf(encodedString.substring(i - 1, i+1)) > 0)) {
                w += ways[1];
                foundTwoDigit =true;
            }
            if (foundTwoDigit && encodedString.charAt(i) != '0') {
                w += ways[0];
            }
            ways[1] = ways[0];
            ways[0] = w;
        }
        return ways[0];
    }

    static int decode(String encodedString) {
        int length = encodedString.length();
        if (length == 1) {
            return canDecode(encodedString);
        } else if (length == 2) {
            if (encodedString.charAt(0) == '0') {
                return canDecode(encodedString);
            }
            return canDecode(encodedString) + 1;
        }
        return canDecode(encodedString.substring(0, 1)) * decode(encodedString.substring(1))
                + canDecode(encodedString.substring(0, 2)) * decode(encodedString.substring(2));
    }

    private static int canDecode(String encodedString) {
        int number = Integer.valueOf(encodedString);
        if (number > 0 && number < 27) {
            return 1;
        }
        return 0;
    }
}
