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
    private int jump2(int[] nums) {
        return jump2Rec(nums, 0);
    }
    private int jump2Rec(int[] nums, int positionIdx
    ) {
        // base case reach the end
        if (positionIdx == nums.length-1) {
            return 0;
        }

        int minJump = nums.length;
        int maxJumpIdx = Math.min(nums.length-1, positionIdx+nums[positionIdx]);
        // for each index inside coverage by idx position
        // 2,3,1,1,4
        // for idx 0 then nextPositionIdx will be 1 and 2
        for (int nextPositionIdx = positionIdx+1; nextPositionIdx <= maxJumpIdx; nextPositionIdx++) {
            int jump = jump2Rec(nums, nextPositionIdx);
            if (jump != nums.length) {
                minJump = Math.min(minJump, 1+jump);
            }
        }

        return minJump;
    }

}