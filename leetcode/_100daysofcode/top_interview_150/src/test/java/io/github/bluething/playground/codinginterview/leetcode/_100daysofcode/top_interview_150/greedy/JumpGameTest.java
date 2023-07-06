package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/jump-game/description/
class JumpGameTest {

    @Test
    void case01() {
        Assertions.assertTrue(canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    void case02() {
        Assertions.assertFalse(canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void case03() {
        Assertions.assertTrue(canJump2(new int[]{2,3,1,1,4}));
    }

    @Test
    void case04() {
        Assertions.assertFalse(canJump2(new int[]{3,2,1,0,4}));
    }

    // use greedy
    private boolean canJump(int[] nums) {
        int goalIdx = nums.length-1;
        for (int i = goalIdx-1; i >= 0; i--) {
            if (i + nums[i] >= goalIdx) {
                goalIdx = i;
            }
        }

        return goalIdx == 0;
    }

    private boolean canJump2(int[] nums) {
        int furthestReachableIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthestReachableIdx) {
                return false;
            }

            furthestReachableIdx = Math.max(furthestReachableIdx, i+nums[i]);
        }

        return true;
    }
}
