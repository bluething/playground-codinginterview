package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/
class SubsetsIITest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,2),
                Arrays.asList(1,2),
                Arrays.asList(1),
                Arrays.asList(2,2),
                Arrays.asList(2),
                Arrays.asList()), subsetsWithDup(new int[]{1,2,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(0),
                Arrays.asList()), subsetsWithDup(new int[]{0}));
    }

    private List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums, 0);
        return results;
    }

    // same with Subset problem
    // but we need to skip the same value for right node
    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] nums, int idx) {
        if (idx >= nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        backtrack(results, temp, nums, idx+1);
        temp.remove(temp.size()-1);

        while (idx+1 < nums.length && nums[idx] == nums[idx+1]) {
            idx++;
        }
        backtrack(results, temp, nums, idx+1);
    }
}
