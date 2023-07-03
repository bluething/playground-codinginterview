package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-interview-150
class LongestConsecutiveSequenceTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(9, longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    private int longestConsecutive(int[] nums) {
        return 0;
    }
}
