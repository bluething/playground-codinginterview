package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// problem https://leetcode.com/problems/3sum/
public class ThreeSumTest {

    @Test
    public void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1));
        Assertions.assertEquals(expected, threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    public void case02() {
        List<List<Integer>> expected = Collections.emptyList();
        Assertions.assertEquals(expected, threeSum(new int[]{0,1,1}));
    }

    @Test
    public void case03() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,0,0));
        Assertions.assertEquals(expected, threeSum(new int[]{0,0,0}));
    }

    private List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int j, k, sum;
        List<List<Integer>> triplets = new ArrayList<>();
        List<Integer> triplet;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            j = i+1;
            k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    if (uniqueTriplets.add(triplet)) {
                        triplets.add(triplet);
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return triplets;
    }
}
