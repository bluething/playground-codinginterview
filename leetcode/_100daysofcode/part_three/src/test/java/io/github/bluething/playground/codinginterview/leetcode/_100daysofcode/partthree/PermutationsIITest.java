package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void case03() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)), permuteUnique2(new int[]{1,2,3}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,1,2),
                Arrays.asList(1,2,1),
                Arrays.asList(2,1,1)), permuteUnique2(new int[]{1,1,2}));
    }

    private List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }

    // in permutation we need to know if we have used the value
    // for each unused and unique value
    //// add the node and mark the position become used
    //// go deep until all value is use
    //// backtrack and mark the position become unused
    //// don't forget to keep the prev (sibling) value
    //// for each sibling we don't allow the duplicate
    ////// this will ensure the result don't contain duplicate combination
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

    private List<List<Integer>> permuteUnique2(int[] nums) {
        Map<Integer, Integer> quotas = new HashMap<>();
        for (int num : nums) {
            quotas.put(num, quotas.getOrDefault(num,0) + 1);
        }
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), nums, quotas);
        return results;
    }

    // built decision tree based on quotas key
    // for each path we reduce the quota
    private void backtrack(List<List<Integer>> results, List<Integer> temp, int[] nums, Map<Integer, Integer> quotas) {
        if (temp.size() == nums.length) {
            results.add(new ArrayList<>(temp));
            return;
        }
        for (Map.Entry<Integer, Integer> entry : quotas.entrySet()) {
            int num = entry.getKey();
            int quota = entry.getValue();
            if (quota == 0) {
                continue;
            }

            // add current node
            temp.add(num);
            // go deep, reduce the quota
            quotas.put(num, quota-1);
            backtrack(results, temp, nums, quotas);
            // backtrack, need to restore the quota
            temp.remove(temp.size()-1);
            quotas.put(num, quota);
        }
    }
}
