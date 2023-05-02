package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
class SubsetsTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)), subsets(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(0)), subsets(new int[]{0}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1,2),
                Arrays.asList(1,2,3),
                Arrays.asList(1,3),
                Arrays.asList(2),
                Arrays.asList(2,3),
                Arrays.asList(3)), subsets2(new int[]{1,2,3}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(0)), subsets2(new int[]{0}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(1),
                Arrays.asList(2,3),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList()), subsets3(new int[]{1,2,3}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(0),
                Arrays.asList()), subsets3(new int[]{0}));
    }

    // for each num
    //// start from 0 as much as current size
    ////// for each
    /////// get previous result as temp
    /////// add current num to temp
    /////// add temp to result
    private List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i=0; i< nums.length; i++) {
            for (int j=0, size=result.size(); j<size; j++) {
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }

    private List<List<Integer>> subsets2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i=start; i< nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }

    private List<List<Integer>> subsets3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        backtrackPickNoPick(results, new ArrayList<>(), nums, 0);
        return results;
    }

    // pick and not pick
    // start from 1st idx, we have 2 options to include and not include the value (left and right node)
    // for each option, move to the next idx recursively (we have same option for each left and right node)
    // for case not include, wee need to remove the last temp because we don't want to include the value (move to right node)
    private void backtrackPickNoPick(List<List<Integer>> result, List<Integer> temp, int[] nums, int idx) {
        if (idx >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // include nums[idx]
        temp.add(nums[idx]);
        backtrackPickNoPick(result, temp, nums, idx+1);
        temp.remove(temp.size()-1);

        // not include nums[idx]
        backtrackPickNoPick(result, temp, nums, idx+1);
    }
}
