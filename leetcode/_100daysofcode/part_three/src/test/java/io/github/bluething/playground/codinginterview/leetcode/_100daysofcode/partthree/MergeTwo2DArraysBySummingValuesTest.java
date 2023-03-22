package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void case03() {
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
        Assertions.assertArrayEquals(result, mergeArrays2(nums1, nums2));
    }

    @Test
    void case04() {
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
        Assertions.assertArrayEquals(result, mergeArrays2(nums1, nums2));
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

    private int[][] mergeArrays2(int[][] nums1, int[][] nums2) {
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;
        int i = 0;
        int j = 0;

        List<int[]> results = new ArrayList<>();
        while (i < nums1Size && j < nums2Size) {
            if (nums1[i][0] == nums2[j][0]) {
                results.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                results.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                results.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }
        while (i < nums1Size) {
            results.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        while (j < nums2Size) {
            results.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }

        return results.toArray(new int[results.size()][]);
    }
}
