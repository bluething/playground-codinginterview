package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
class TwoSumTest {

    @Test
    void case01() {
        int[] expected = new int[]{0,1};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void case02() {
        int[] expected = new int[]{1,2};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    void case03() {
        int[] expected = new int[]{0,1};
        Assertions.assertArrayEquals(expected, twoSum(new int[]{3,3}, 6));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsIdx = new HashMap<>();
        numsIdx.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            // seach in current map if contain key target - nums[i]
            if (numsIdx.get(target - nums[i]) != null) {
                return new int[]{numsIdx.get(target - nums[i]), i};
            }
            numsIdx.put(nums[i], i);
        }
        return new int[]{};
    }
}
