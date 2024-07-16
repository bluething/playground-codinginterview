package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextGreaterElementITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{-1,3,-1}, nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{3,-1}, nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }
    private int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return new int[]{};
    }
}
