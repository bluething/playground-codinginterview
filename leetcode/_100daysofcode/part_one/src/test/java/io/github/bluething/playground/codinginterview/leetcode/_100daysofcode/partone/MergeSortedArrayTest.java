package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    public void case01() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] expectedArray = new int[]{1,2,2,3,5,6};
        merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    @Test
    public void case02() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] expectedArray = new int[]{1};
        merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    @Test
    public void case03() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] expectedArray = new int[]{1};
        merge(nums1, 1, nums2, 1);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}
