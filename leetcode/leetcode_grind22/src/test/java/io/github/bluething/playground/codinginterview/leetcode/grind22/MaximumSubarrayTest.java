package io.github.bluething.playground.codinginterview.leetcode.grind22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(6, maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, maxSubArray(new int[]{1}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(23, maxSubArray(new int[]{5,4,-1,7,8}));
    }

    private int maxSubArray(int[] nums) {
        return 0;
    }
}
