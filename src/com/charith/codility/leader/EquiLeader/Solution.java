package com.charith.codility.leader.EquiLeader;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int solution(int[] A) {
        int numberOfEquiLeaders = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer integer : A) {
            frequencyMap.merge(integer, 1, Integer::sum);
        }
        int maxFrequencyValue = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxFrequencyValue = entry.getKey();
            }
        }

        if(maxFrequency < A.length * .5){
            return 0;
        }

        int leftFrequencyCount = 0;
        int rightFrequencyCount = maxFrequency;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxFrequencyValue) {
                leftFrequencyCount++;
                rightFrequencyCount--;
            }
            if (leftFrequencyCount > (.5 * (i + 1)) && (rightFrequencyCount > .5 * (A.length - i - 1))) {
                numberOfEquiLeaders++;
            }
        }

        return numberOfEquiLeaders;
    }

}
