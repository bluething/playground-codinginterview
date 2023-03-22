package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class MergeTwo2DArraysBySummingValuesTest {

    @Test
    void case01() {
        int[][] nums1 = new int[][]{{1,2},
                {2,3},
                {4,5}};
        int[][] nums2 = new int[][]{{1,4},
                {3,2},
                {4,1}};
        int[][] result = new int[][]{{1,6},
                {2,3},
                {3,2},
                {4,6}};
        Assertions.assertArrayEquals(result, mergeArrays(nums1, nums2));
    }

    @Test
    void case02() {
        int[][] nums1 = new int[][]{{2,4},
                {3,6},
                {5,5}};
        int[][] nums2 = new int[][]{{1,3},
                {4,3}};
        int[][] result = new int[][]{{1,3},
                {2,4},
                {3,6},
                {4,3},
                {5,5}};
        Assertions.assertArrayEquals(result, mergeArrays(nums1, nums2));
    }

    private int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> numSums = new HashMap<>();
        for (int[] nums : nums1) {
            numSums.put(nums[0], nums[1]);
        }
        for (int[] nums : nums2) {
            numSums.put(nums[0], numSums.getOrDefault(nums[0], 0) + nums[1]);
        }

        int[][] results = new int[numSums.size()][];
        int idx = 0;
        for (Map.Entry<Integer, Integer> numSum : numSums.entrySet()) {
            results[idx++] = new int[]{numSum.getKey(), numSum.getValue()};
        }

        Arrays.sort(results, Comparator.comparingInt(o -> o[0]));
        return results;
    }
}
