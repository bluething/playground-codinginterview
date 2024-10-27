package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimuminRotatedSortedArrayIITest {
    @Test
    void case01() {
        Assertions.assertEquals(1, findMin(new int[]{1,3,5}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, findMin(new int[]{2,2,2,0,1}));
    }

    private int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
