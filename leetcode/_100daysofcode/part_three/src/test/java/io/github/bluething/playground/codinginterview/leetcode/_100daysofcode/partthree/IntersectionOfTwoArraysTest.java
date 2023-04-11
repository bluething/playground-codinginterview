package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
class IntersectionOfTwoArraysTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{2}, intersection(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{9,4}, intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    private int[] intersection(int[] nums1, int[] nums2) {
        return null;
    }
}
