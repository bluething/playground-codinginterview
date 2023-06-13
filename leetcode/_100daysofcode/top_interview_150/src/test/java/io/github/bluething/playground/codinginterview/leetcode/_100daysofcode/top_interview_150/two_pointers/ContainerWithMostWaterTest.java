package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
class ContainerWithMostWaterTest {

    @Test
    void case01() {
        Assertions.assertEquals(1, maxArea(new int[]{1, 1}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(16, maxArea(new int[]{4,3,2,1,4}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(2, maxArea(new int[]{1, 2, 1}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(49, maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    private int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            result = Math.max(result, (right-left) * (Math.min(height[right], height[left])));
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }
}
