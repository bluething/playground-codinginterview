package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/permutations-ii/
class PermutationsIITest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)), permuteUnique(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,1,2),
                Arrays.asList(1,2,1),
                Arrays.asList(2,1,1)), permuteUnique(new int[]{1,1,2}));
    }

    private List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] nums, boolean[] isUsed) {
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        } else {
            int prev = -11;
            for (int i=0; i < isUsed.length; i++) {
                if (isUsed[i] || nums[i] == prev) {
                    continue;
                }
                temp.add(nums[i]);
                isUsed[i] = true;
                backtrack(results, temp, nums, isUsed);
                temp.remove(temp.size()-1);
                isUsed[i] = false;
                prev = nums[i];
            }
        }
    }
}
