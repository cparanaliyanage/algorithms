package com.charith.Zalando;

public class Matrix {

    public static String solution(int U, int L, int[] C) {
        String[] firstRow = new String[C.length];
        String[] secondRow = new String[C.length];
        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                firstRow[i] = "1";
                secondRow[i] = "1";
                U--;
                L--;
            } else if (C[i] == 0) {
                firstRow[i] = "0";
                secondRow[i] = "0";
            }
        }

        for (int i = 0; i < firstRow.length; i++) {
            if (firstRow[i] == null && U > 0) {
                firstRow[i] = "1";
                U--;
            } else if(firstRow[i] == null){
                firstRow[i] = "0";
            }
        }
        for (int i = 0; i < secondRow.length; i++) {
            if (secondRow[i] == null && L > 0 && firstRow[i] !=null) {
                secondRow[i] = "1";
                L--;
            } else if(secondRow[i] == null){
                secondRow[i] = "0";
            }
        }
        return String.join("", firstRow) + "," + String.join("", secondRow);
    }
}
