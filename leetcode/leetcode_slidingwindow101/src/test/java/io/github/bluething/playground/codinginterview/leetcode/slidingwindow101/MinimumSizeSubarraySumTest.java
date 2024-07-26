package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        int left = 0, right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
