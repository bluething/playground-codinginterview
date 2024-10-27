package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchinRotatedSortedArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, search(new int[]{4,5,6,7,0,1,2}, 0));
    }
    @Test
    void case02() {
        Assertions.assertEquals(-1, search(new int[]{4,5,6,7,0,1,2}, 3));
    }
    @Test
    void case03() {
        Assertions.assertEquals(-1, search(new int[]{1}, 0));
    }
    @Test
    void case04() {
        Assertions.assertEquals(1, search(new int[]{3,1}, 1));
    }
    private int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
        }

        return -1;
    }
}
