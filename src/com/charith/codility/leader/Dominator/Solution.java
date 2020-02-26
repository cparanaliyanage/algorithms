package com.charith.codility.leader.Dominator;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int solution2(int[] A) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer integer : A) {
            frequencyMap.merge(integer, 1, Integer::sum);
        }

        int maximumFrequency = 0;
        int maximumFrequencyValue = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (maximumFrequency < entry.getValue()) {
                maximumFrequency = entry.getValue();
                maximumFrequencyValue = entry.getKey();
            }
        }
        if (maximumFrequency > A.length * .5) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == maximumFrequencyValue) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int solution(int[] A) {
        // TODO if we put merge function, getting performance issues
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer integer : A) {
            if (!frequencyMap.containsKey(integer)) {
                frequencyMap.put(integer, 1);
            } else {
                int count = frequencyMap.get(integer);
                frequencyMap.put(integer, count + 1);
            }
        }
        int maximumFrequency = 0;
        int maximumFrequencyValue = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (maximumFrequency < entry.getValue()) {
                maximumFrequency = entry.getValue();
                maximumFrequencyValue = entry.getKey();
            }
        }
        if (maximumFrequency > A.length * .5) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == maximumFrequencyValue) {
                    return i;
                }
            }
        }
        return -1;
    }

}
