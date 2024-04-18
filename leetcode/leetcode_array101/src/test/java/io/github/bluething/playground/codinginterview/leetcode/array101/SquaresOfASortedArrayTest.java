package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
// use two pointers (left-right)
//
// the key is nums is sorted in non-decreasing order, it doesn't mean sort by asc!
class SquaresOfASortedArrayTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, sortedSquares(new int[]{-4,-1,0,3,10}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{4,9,9,49,121}, sortedSquares(new int[]{-7,-3,2,3,11}));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, sortedSquares2(new int[]{-4,-1,0,3,10}));
    }
    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{4,9,9,49,121}, sortedSquares2(new int[]{-7,-3,2,3,11}));
    }
    @Test
    void case05() {
        Assertions.assertArrayEquals(new int[]{1,4,9,25}, sortedSquares2(new int[]{-5,-3,-2,-1}));
    }

    private int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    private int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1, idx = nums.length - 1;
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
