package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
class IntersectionOfTwoArraysTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{2}, intersection(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{4,9}, intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{4,6}, intersection(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4}));
    }

    private int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums1) {
            uniqueNums.add(num);
        }
        Set<Integer> intersec = new HashSet<>();
        for (int num : nums2) {
            if (uniqueNums.contains(num)) {
                intersec.add(num);
            }
        }

        int[] intersecArr = new int[intersec.size()];
        int idx = 0;
        for (int num : intersec) {
            intersecArr[idx++] = num;
        }
        return intersecArr;
    }
}
