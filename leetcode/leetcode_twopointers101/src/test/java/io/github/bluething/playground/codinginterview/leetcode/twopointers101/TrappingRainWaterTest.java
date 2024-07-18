package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    @Test
    void case01() {
        Assertions.assertEquals(6, trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(9, trap(new int[]{4,2,0,3,2,5}));
    }
    private int trap(int[] height) {
        int[] left = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            left[i] = i == 0 ? height[i] : Math.max(left[i-1], height[i]);
        }
        int[] right = new int[height.length];
        for (int i = height.length-1; i >= 0; i--) {
            right[i] = i == height.length-1 ? height[i] : Math.max(right[i+1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }

        return sum;
    }
}