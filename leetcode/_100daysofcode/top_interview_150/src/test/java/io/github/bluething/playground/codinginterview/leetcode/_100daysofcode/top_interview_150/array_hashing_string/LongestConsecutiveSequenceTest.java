package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

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

    @Test
    void case03() {
        Assertions.assertEquals(3, longestConsecutive(new int[]{1,0,-1}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(4, longestConsecutive2(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(9, longestConsecutive2(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(3, longestConsecutive2(new int[]{1,0,-1}));
    }

    // brute force solution
    // check if current num have consecutive num in the nums array
    private int longestConsecutive(int[] nums) {
        int maxLength = 0;
        int curentLength = 0;
        int currentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            curentLength = 1;
            currentNum = nums[i];
            while (isNumExist(currentNum+1, nums)) {
                currentNum++;
                curentLength++;
            }

            maxLength = Math.max(maxLength, curentLength);
        }

        return maxLength;
    }

    private boolean isNumExist(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return true;
            }
        }

        return false;
    }

    private int longestConsecutive2(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }

        int maxLength = 0;
        int curentLength = 0;
        int currentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            curentLength = 1;
            currentNum = nums[i];
            // optimization part
            // start to check the sequence if only if the currentNum is the smallest in the sequence
            if (!uniqueNums.contains(currentNum-1)) {
                while (uniqueNums.contains(currentNum+1)) {
                    currentNum++;
                    curentLength++;
                }
            }

            maxLength = Math.max(maxLength, curentLength);
        }

        return maxLength;
    }
}
