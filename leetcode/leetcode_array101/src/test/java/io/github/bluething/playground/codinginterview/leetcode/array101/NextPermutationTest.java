package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {
    @Test
    void case01() {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1,3,2}, nums);
    }
    @Test
    void case02() {
        int[] nums = {3,2,1};
        nextPermutation(nums);
                Assertions.assertArrayEquals(new int[]{1,2,3}, nums);
    }
    @Test
    void case03() {
        int[] nums = {1,1,5};
        nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1,5,1}, nums);
    }

    private void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // find 1st decreasing element
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // swap 1st decreasing (i) element with 1st ascending element (compare to nums[i] from the right
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
