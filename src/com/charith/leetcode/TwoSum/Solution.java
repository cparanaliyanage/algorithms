package com.charith.leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elementToLocation = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (elementToLocation.get(target - nums[i]) != null) {
                return new int[]{elementToLocation.get(target - nums[i]), i};
            }
            elementToLocation.put(nums[i], i);
        }
        return new int[]{};
    }
}
