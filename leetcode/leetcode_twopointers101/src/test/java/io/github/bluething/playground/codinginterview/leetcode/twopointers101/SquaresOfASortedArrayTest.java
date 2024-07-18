package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquaresOfASortedArrayTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, sortedSquares(new int[]{-4,-1,0,3,10}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{4,9,9,49,121}, sortedSquares(new int[]{-7,-3,2,3,11}));
    }
    private int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int idx = result.length-1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[idx--] = leftSquare;
                left++;
            } else {
                result[idx--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
