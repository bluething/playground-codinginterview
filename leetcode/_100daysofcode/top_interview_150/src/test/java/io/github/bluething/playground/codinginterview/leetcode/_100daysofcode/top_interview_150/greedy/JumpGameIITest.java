package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    private int jump(int[] nums) {
        return 0;
    }
}
