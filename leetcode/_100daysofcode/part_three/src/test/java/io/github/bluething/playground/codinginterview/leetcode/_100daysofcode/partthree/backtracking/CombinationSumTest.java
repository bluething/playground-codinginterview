package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
class CombinationSumTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(2,2,3),
                Arrays.asList(7)),
                combinationSum(new int[]{2,3,6,7}, 7));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(2,2,2,2),
                        Arrays.asList(2,3,3),
                        Arrays.asList(3,5)),
                combinationSum(new int[]{2,3,5}, 8));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Collections.emptyList(),
                combinationSum(new int[]{2}, 1));
    }

    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), candidates, 0, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] candidates, int total, int target, int idx) {
        if (total == target) {
            results.add(new ArrayList<>(temp));
            return;
        }
        if (idx >= candidates.length || total > target) {
            return;
        }

        temp.add(candidates[idx]);
        backtrack(results, temp, candidates, total+candidates[idx], target, idx);
        temp.remove(temp.size()-1);
        backtrack(results, temp, candidates, total, target, idx+1);
    }
}
