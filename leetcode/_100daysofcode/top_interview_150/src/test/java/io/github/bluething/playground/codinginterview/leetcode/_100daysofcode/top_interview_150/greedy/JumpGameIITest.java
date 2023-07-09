package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
class JumpGameIITest {

    @Test
    void case01() {
        Assertions.assertEquals(2, jump(new int[]{2,3,1,1,4}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, jump(new int[]{2,3,0,1,4}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(2, jump2(new int[]{2,3,1,1,4}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(2, jump2(new int[]{2,3,0,1,4}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(2, jump3(new int[]{2,3,1,1,4}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(2, jump3(new int[]{2,3,0,1,4}));
    }

    @Test
    void case07() {
        Assertions.assertEquals(2, jump4(new int[]{2,3,1,1,4}));
    }

    @Test
    void case08() {
        Assertions.assertEquals(2, jump4(new int[]{2,3,0,1,4}));
    }

    // brute force approach
    // we track all move from idx 0 to reach each position
    //  watch out! each index can be reach from previous index
    //  then we need to update the step with minimum value
    private int jump(int[] nums) {
        int n = nums.length;
        int[] minSteps = new int[n];
        Arrays.fill(minSteps, n);
        minSteps[0] = 0;

        for (int i = 0; i < n-1; i++) {
            // find max idx can be reached
            int maxJumpIdx = Math.min(n-1, i+nums[i]);
            // coverage loop
            for (int j = i+1; j <= maxJumpIdx; j++) {
                // set only minimum step needed to reach j idx
                //  minSteps[j] existing value come from previous coverage
                minSteps[j] = Math.min(minSteps[j], 1+minSteps[i]);
            }
        }

        return minSteps[n-1];
    }
    // get TLE
    private int jump2(int[] nums) {
        return jump2Rec(nums, 0);
    }
    private int jump2Rec(int[] nums, int positionIdx) {
        // base case reach the end
        if (positionIdx >= nums.length-1) {
            return 0;
        }

        int minJump = nums.length;
        int maxJumpIdx = positionIdx+nums[positionIdx];
        // try all possible jump from positionIdx+1 till maxJumpIdx
        //  create a decision tree
        //  find the minimum value
        for (int nextPositionIdx = positionIdx+1; nextPositionIdx <= maxJumpIdx; nextPositionIdx++) {
            minJump = Math.min(minJump, 1+jump2Rec(nums, nextPositionIdx));
        }

        return minJump;
    }

    private int jump3(int[] nums) {
        Integer[] memoMinSteps = new Integer[nums.length];
        return jump3Rec(nums, 0, memoMinSteps);
    }
    private int jump3Rec(int[] nums, int positionIdx, Integer[] memoMinSteps) {
        // base case reach the end
        if (positionIdx == nums.length-1) {
            return 0;
        }

        if (memoMinSteps[positionIdx] != null) {
            return memoMinSteps[positionIdx];
        }

        int minJump = nums.length;
        int maxJumpIdx = Math.min(nums.length-1, positionIdx+nums[positionIdx]);
        // try all possible jump from positionIdx+1 till maxJumpIdx
        for (int nextPositionIdx = positionIdx+1; nextPositionIdx <= maxJumpIdx; nextPositionIdx++) {
            int jump = jump3Rec(nums, nextPositionIdx, memoMinSteps);
            if (jump != nums.length) {
                minJump = Math.min(minJump, 1+jump);
            }
        }

        return memoMinSteps[positionIdx] = minJump;
    }

    // greedy algorithm
    // track max index we can reach for each index
    // track the previous max index we can reach
    private int jump4(int[] nums) {
        int minJump = 0;
        int currentEndJumpIdx = 0;
        int maxEndJumpIdx = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxEndJumpIdx = Math.max(maxEndJumpIdx, i+nums[i]);

            // currentEndJumpIdx become a sign when we start new step
            // enter the new step, increment it then set the new sign
            if (i == currentEndJumpIdx) {
                currentEndJumpIdx = maxEndJumpIdx;
                minJump++;
            }

        }

        return minJump;
    }

}
