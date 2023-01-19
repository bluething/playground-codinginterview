package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// problem https://leetcode.com/problems/two-sum/
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
        Map<Integer, Integer> numIdx = new HashMap<>();
        int expectedIdx = 1;
        for (int i = 0; i < nums.length; i++) {
            expectedIdx = target - nums[i];
            if (numIdx.containsKey(expectedIdx)) {
                return new int[]{numIdx.get(expectedIdx), i};
            } else {
                numIdx.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
