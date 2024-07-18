package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortColorsTest {
    @Test
    void case01() {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }
    @Test
    void case02() {
        int[] nums = {2,0,1};
        sortColors(nums);
        Assertions.assertArrayEquals(new int[]{0,1,2}, nums);
    }
    private void sortColors(int[] nums) {
        int left = 0, right = nums.length-1;
        int cur = 0;
        while (cur <= right) {
            if (nums[cur] == 2) {
                swap(nums, cur, right);
                right--;
            } else if (nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, left);
                left++;
                cur++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
