package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/description/
class CombinationSumIITest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1, 1, 6),
                        Arrays.asList(1, 2, 5),
                        Arrays.asList(1, 7),
                        Arrays.asList(2,6)),
                combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,2),
                        Arrays.asList(5)),
                combinationSum2(new int[]{2,5,2,1,2}, 5));
    }

    private List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] candidates, int target, int idx) {
        if (target == 0) {
            results.add(new ArrayList<>(temp));
        }
        if (target <= 0) {
            return;
        }
        int prev = -1;
        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] == prev) {
                continue;
            }
            temp.add(candidates[i]);
            backtrack(results, temp, candidates, target-candidates[i], i+1);
            temp.remove(temp.size()-1);
            prev = candidates[i];
        }
    }
}
