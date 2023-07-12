package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.backtracking;

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

    // using intuition, cascading
    // start from subset in output list
    // At each step one takes new integer into consideration and generates new subsets from the existing ones
    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        // []
        outputs.add(new ArrayList<>());

        // num = 1
        // [] [1]
        // num = 2
        // [] [1] [2] [1][2]
        for (int num : nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> current : outputs) {
                // when current is empty then is like create new list with num value
                // otherwise it will add the num to the existing list
                temp.add(new ArrayList<>(current){{add(num);}});
            }
            for (List<Integer> current : temp) {
                outputs.add(current);
            }
        }

        return outputs;
    }

    private List<List<Integer>> subsets2(int[] nums) {
        // only for local test
        Arrays.sort(nums);
        List<List<Integer>> outputs = new ArrayList<>();
        backtracking(outputs, new ArrayList<>(), nums, 0);
        return outputs;
    }
    private void backtracking(List<List<Integer>> outputs, List<Integer> temp, int[] nums, int idx) {
        outputs.add(new ArrayList<>(temp));
        for (int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            // recursively move to the bottom, all child
            backtracking(outputs, temp, nums, i+1);
            // backtrack, we need to remove last element
            temp.remove(temp.size()-1);
        }
    }

    private List<List<Integer>> subsets3(int[] nums) {
        // only for local test
        Arrays.sort(nums);
        List<List<Integer>> outputs = new ArrayList<>();
        backtrackingPickNoPick(outputs, new ArrayList<>(), nums, 0);
        return outputs;
    }
    private void backtrackingPickNoPick(List<List<Integer>> outputs, List<Integer> temp, int[] nums, int idx) {
        if (idx >= nums.length) {
            outputs.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        backtrackingPickNoPick(outputs, temp, nums, idx+1);

        // not pick nums[idx]
        temp.remove(temp.size()-1);
        backtrackingPickNoPick(outputs, temp, nums, idx+1);
    }
}
