package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LongestConsecutiveSequenceTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(9, longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(3, longestConsecutive(new int[]{1,0,-1}));
    }

    private int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        Arrays.sort(nums);
        int count = 1;
        int longestCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                // check if consecutive
                if (nums[i] == nums[i - 1] + 1) {
                    count++;
                } else {
                    longestCount = Math.max(count, longestCount);
                    count = 1;
                }
            }
        }


        return Math.max(count, longestCount);
    }
}
