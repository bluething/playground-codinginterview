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
        return 0;
    }
}
