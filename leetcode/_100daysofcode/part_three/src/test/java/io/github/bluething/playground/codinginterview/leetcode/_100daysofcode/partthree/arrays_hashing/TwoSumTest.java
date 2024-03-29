package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.arrays_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSumTest {
    @Test
    public void case01() {
        int[] expected = new int[]{0,1};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void case02() {
        int[] expected = new int[]{1,2};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    public void case03() {
        int[] expected = new int[]{0,1};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{3,3}, 6));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numPairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numPairs.get(target-nums[i]) != null) {
                return new int[]{numPairs.get(target-nums[i]), i};
            }
            numPairs.put(nums[i], i);
        }
        return new int[]{};
    }
}
