package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchinRotatedSortedArrayIITest {
    @Test
    void case01() {
        Assertions.assertTrue(search(new int[]{2,5,6,0,0,1,2}, 0));
    }
    @Test
    void case02() {
        Assertions.assertFalse(search(new int[]{2,5,6,0,0,1,2}, 3));
    }

    private boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right--;
                } else {
                    left++;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
