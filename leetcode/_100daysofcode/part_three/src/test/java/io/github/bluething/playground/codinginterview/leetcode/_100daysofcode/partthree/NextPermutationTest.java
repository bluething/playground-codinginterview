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
