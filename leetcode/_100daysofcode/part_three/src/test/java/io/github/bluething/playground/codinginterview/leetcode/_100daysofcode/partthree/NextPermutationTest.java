package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/next-permutation/description/
class NextPermutationTest {

    @Test
    void case01() {
        int[] arr = new int[]{1,2,3};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,3,2}, arr);
    }

    @Test
    void case02() {
        int[] arr = new int[]{3,2,1};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3}, arr);
    }

    @Test
    void case03() {
        int[] arr = new int[]{1,1,5};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,5,1}, arr);
    }

    @Test
    void case04() {
        int[] arr = new int[]{1,3,5,4,3,2,1};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,4,1,2,3,3,5}, arr);
    }

    // 1-3-5-4-3-2-1
    // from right, find 1st decrement value, we have 3 in idx 1
    // we need to swap this value with the 1st larger value on the right
    // in this case we swap 3 in idx 1 with 4 in idx 3
    // 1-4-5-3-3-2-1
    // the last step is reverse the rest of the array 5-3-3-2-1
    // 1-4-1-2-3-3-5
    private void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i >= 0 && (nums[i] >= nums[i+1])) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length-1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);;

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
