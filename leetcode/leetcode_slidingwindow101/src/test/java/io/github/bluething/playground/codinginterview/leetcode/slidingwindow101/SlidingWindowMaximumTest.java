package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximumTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{3,3,5,5,6,7}, maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1}, maxSlidingWindow(new int[]{1}, 1));
    }
    private int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int[] res = new int[n - k + 1];
        Deque<Integer> window = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!window.isEmpty() && window.peekFirst() <= i - k) {
                window.pollFirst();
            }
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }
            window.offerLast(i);
            if (i >= k - 1) {
                res[i - k + 1] = nums[window.peekFirst()];
            }
        }
        return res;
    }
}
