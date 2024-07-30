package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TwoSumTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{0,1}, twoSum(new int[]{2,7,11,15}, 9));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{3,2,4}, 6));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{0,1}, twoSum(new int[]{3,3}, 6));
    }
    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{0,2}, twoSum(new int[]{-3,4,3,90}, 0));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
