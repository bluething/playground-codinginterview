package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/3sum/
class ThreeSumTest {

    @Test
    void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1));
        Assertions.assertEquals(expected, threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    void case02() {
        List<List<Integer>> expected = Collections.emptyList();
        Assertions.assertEquals(expected, threeSum(new int[]{0,1,1}));
    }

    @Test
    void case03() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,0,0));
        Assertions.assertEquals(expected, threeSum(new int[]{0,0,0}));
    }

    @Test
    void case04() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1));
        Assertions.assertEquals(expected, threeSum2(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    void case05() {
        List<List<Integer>> expected = Collections.emptyList();
        Assertions.assertEquals(expected, threeSum2(new int[]{0,1,1}));
    }

    @Test
    void case06() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,0,0));
        Assertions.assertEquals(expected, threeSum2(new int[]{0,0,0}));
    }

    private List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j,k;
        while (i < nums.length-1) {
            if (i > 0 && nums[i-1] == nums[i]) {
                i++;
                continue;
            }
            j= i+1;
            k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k  && nums[j-1] == nums[j]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }

        return triplets;
    }

    // slow
    private List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j,k;
        Set<List<Integer>> uniqueTriplet = new HashSet<>();
        while (i < nums.length-1) {
            j = i+1;
            k = nums.length-1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    if (uniqueTriplet.add(List.of(nums[i], nums[j], nums[k]))) {
                        triplets.add(List.of(nums[i], nums[j], nums[k]));
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }

        return triplets;
    }
}
