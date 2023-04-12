package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{2}, intersection2(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    @Test
    void case05() {
        Assertions.assertArrayEquals(new int[]{4,9}, intersection2(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    @Test
    void case06() {
        Assertions.assertArrayEquals(new int[]{4,6}, intersection2(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4}));
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

    private int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersect = new ArrayList<>();
        getIntersectBinarySearch(nums2, nums1[0], intersect);
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] != nums1[i-1]) {
                getIntersectBinarySearch(nums2, nums1[i], intersect);
            }
        }

        int[] results = new int[intersect.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = intersect.get(i);
        }

        return results;
    }

    private void getIntersectBinarySearch(int[] nums, int target, List<Integer> intersect) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                intersect.add(nums[mid]);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
