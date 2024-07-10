package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubarrayProductLessThanKTest {
    @Test
    void case01() {
        Assertions.assertEquals(8, numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }

    private int numSubarrayProductLessThanK(int[] nums, int k) {
        return 0;
    }
}
