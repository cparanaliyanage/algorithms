package com.charith.codility.arrays.oddoccurrencesinarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static int solution(int[] A) {
        Map<Integer, List<Integer>> frequencyMap = new HashMap<>();
        frequencyMap.put(1, new ArrayList<>());
        for (Integer integer : A) {
            if (frequencyMap.get(1).contains(integer)) {
                frequencyMap.get(1).remove(integer);
            } else {
                frequencyMap.get(1).add(integer);
            }
        }
        return frequencyMap.get(1).get(0);
    }

    public static int solution2(int[] A) {
        int difference = A[0];
        for (int i = 1; i < A.length; i++) {
            difference ^= A[i];
        }
        return difference;
    }

}
