package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianofTwoSortedArraysTest {
    @Test
    void case01() {
        Assertions.assertEquals(2.0d, findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(2.5d, findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0d;
    }
}
