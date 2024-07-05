package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    private int[] twoSum(int[] nums, int target) {
        return new int[]{};
    }
}
