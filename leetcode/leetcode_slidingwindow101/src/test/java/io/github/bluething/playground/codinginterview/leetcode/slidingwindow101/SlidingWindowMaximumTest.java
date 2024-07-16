package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SlidingWindowMaximumTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{3,3,5,5,6,7}, maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1}, maxSlidingWindow(new int[]{1}, 3));
    }
    private int[] maxSlidingWindow(int[] nums, int k) {
        return new int[]{};
    }
}
