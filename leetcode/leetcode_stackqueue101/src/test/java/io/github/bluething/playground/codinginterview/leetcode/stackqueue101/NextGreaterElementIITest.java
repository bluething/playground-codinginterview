package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextGreaterElementIITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{2,-1,2}, nextGreaterElements(new int[]{1,2,1}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{2,3,4,-1,4}, nextGreaterElements(new int[]{1,2,3,4,3}));
    }

    private int[] nextGreaterElements(int[] nums) {
        return new int[]{};
    }
}
