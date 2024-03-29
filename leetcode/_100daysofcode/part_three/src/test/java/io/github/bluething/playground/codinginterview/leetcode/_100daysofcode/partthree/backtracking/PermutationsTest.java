package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/permutations/
class PermutationsTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)), permute(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(0,1),
                Arrays.asList(1,0)), permute(new int[]{0,1}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1)), permute(new int[]{1}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)), permute2(new int[]{1,2,3}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(0,1),
                Arrays.asList(1,0)), permute2(new int[]{0,1}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1)), permute2(new int[]{1}));
    }

    private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }

    // in permutation we need to know if we have used the value
    // for each unused value
    //// add the node and mark as used
    //// go deep until all value is used
    //// backtrack and mark as unused
    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] nums, boolean[] isUsed) {
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        } else {
            for (int i=0; i < isUsed.length; i++) {
                if (isUsed[i]) {
                    continue;
                }
                temp.add(nums[i]);
                isUsed[i] = true;
                backtrack(results, temp, nums, isUsed);
                temp.remove(temp.size()-1);
                isUsed[i] = false;
            }
        }
    }

    private List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        } else {
            for (int i=0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                backtrack(results, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
