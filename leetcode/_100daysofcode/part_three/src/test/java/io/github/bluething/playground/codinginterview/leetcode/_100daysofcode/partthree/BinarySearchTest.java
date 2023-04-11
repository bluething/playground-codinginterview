package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/binary-search/
class BinarySearchTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void case02() {
        Assertions.assertEquals(-1, search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    void case03() {
        Assertions.assertEquals(4, search2(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void case04() {
        Assertions.assertEquals(-1, search2(new int[]{-1,0,3,5,9,12}, 2));
    }

    private int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int search2(int[] nums, int target) {
        return binarySearchRec(nums, target, 0, nums.length-1);
    }
    private int binarySearchRec(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearchRec(nums, target, mid + 1, right);
        } else {
            return binarySearchRec(nums, target, left, mid-1);
        }
    }
}
