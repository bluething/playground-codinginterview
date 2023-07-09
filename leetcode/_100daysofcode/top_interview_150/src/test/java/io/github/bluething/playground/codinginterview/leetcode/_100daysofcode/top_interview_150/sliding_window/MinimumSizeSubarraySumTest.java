package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan-v2&envId=top-interview-150
class MinimumSizeSubarraySumTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(1, minSubArrayLen(4, new int[]{1,4,4}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }

    private int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // adjust the window until the sum less than target
            //  we need to adjust the window because we need to find the smallest length of window
            while (sum >= target) {
                // find minimum length
                result = Math.min(result, i - left + 1);
                // subtract leftmost value from sum then move the pointer to the next element
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
