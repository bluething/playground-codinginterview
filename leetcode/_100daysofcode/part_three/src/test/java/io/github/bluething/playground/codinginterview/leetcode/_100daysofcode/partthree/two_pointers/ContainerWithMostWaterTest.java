package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/container-with-most-water/description/
class ContainerWithMostWaterTest {

    @Test
    public void case01() {
        Assertions.assertEquals(1, maxArea(new int[]{1, 1}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(16, maxArea(new int[]{4,3,2,1,4}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(2, maxArea(new int[]{1, 2, 1}));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(49, maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void case05() {
        Assertions.assertEquals(1, maxArea2(new int[]{1, 1}));
    }

    @Test
    public void case06() {
        Assertions.assertEquals(16, maxArea2(new int[]{4,3,2,1,4}));
    }

    @Test
    public void case07() {
        Assertions.assertEquals(2, maxArea2(new int[]{1, 2, 1}));
    }

    @Test
    public void case08() {
        Assertions.assertEquals(49, maxArea2(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    private int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            result = Math.max(result, (right-left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]){
                right--;
            } else {
                left++;
                right--;
            }
        }

        return result;
    }

    private int maxArea2(int[] height) {
        int result = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            if (height[left] < height[right]) {
                result = Math.max(result, height[left] * (right-left));
                left++;
            } else {
                result = Math.max(result, height[right] * (right-left));
                right--;
            }
        }
        return result;
    }
}
